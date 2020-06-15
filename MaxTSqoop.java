import java.io.IOException;

import com.cloudera.sqoop.lib.RecordParser.ParseError;

import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.*;

public class MaxTSqoop extends Configured implements Tool {

  public static class MaxTMapper
      extends Mapper<LongWritable, Text, LongWritable, NCDC_1950> {

    private NCDC_1950 maxtemp = null;

    public void map(LongWritable k, Text v, Context context) {
      NCDC_1950 temp = new NCDC_1950();
      try {
        temp.parse(v); // Auto-generated: parse all fields from text.
      } catch (ParseError pe) {
        // Got a malformed record. Ignore it.
        return;
      }

      Integer id = temp.get_airTemp();
      if (null == id) {
        return;
      } else {
        if (maxtemp == null
            || id.intValue() > maxtemp.get_airTemp().intValue()) {
          maxtemp = temp;
        }
      }
    }

    public void cleanup(Context context)
        throws IOException, InterruptedException {
      if (null != maxtemp) {
        context.write(new LongWritable(0), maxtemp);
      }
    }
  }

  public static class MaxTReducer
      extends Reducer<LongWritable, NCDC_1950, NCDC_1950, NullWritable> {

    // There will be a single reduce call with key '0' which gets
    // the max widget from each map task. Pick the max widget from
    // this list.
    public void reduce(LongWritable k, Iterable<NCDC_1950> vals, Context context)
        throws IOException, InterruptedException {
      NCDC_1950 maxtemp = null;

      for (NCDC_1950 w : vals) {
        if (maxtemp == null
            || w.get_airTemp().intValue() > maxtemp.get_airTemp().intValue()) {
          try {
            maxtemp = (NCDC_1950) w.clone();
          } catch (CloneNotSupportedException cnse) {
            // Shouldn't happen; Sqoop-generated classes support clone().
            throw new IOException(cnse);
          }
        }
      }

      if (null != maxtemp) {
        context.write(maxtemp, NullWritable.get());
      }
    }
  }

  public int run(String [] args) throws Exception {
    Job job = new Job(getConf());

    job.setJarByClass(MaxTSqoop.class);

    job.setMapperClass(MaxTMapper.class);
    job.setReducerClass(MaxTReducer.class);

    FileInputFormat.addInputPath(job, new Path("NCDC_1950"));
    FileOutputFormat.setOutputPath(job, new Path("maxtempSqoop"));

    job.setMapOutputKeyClass(LongWritable.class);
    job.setMapOutputValueClass(NCDC_1950.class);

    job.setOutputKeyClass(NCDC_1950.class);
    job.setOutputValueClass(NullWritable.class);

    job.setNumReduceTasks(1);

    if (!job.waitForCompletion(true)) {
      return 1; // error.
    }

    return 0;
  }

  public static void main(String [] args) throws Exception {
    int ret = ToolRunner.run(new MaxTSqoop(), args);
    System.exit(ret);
  }
}
