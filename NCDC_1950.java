// ORM class for table 'NCDC_1950'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Mar 06 22:50:18 CST 2019
// For connector: org.apache.sqoop.manager.DirectMySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class NCDC_1950 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("usWStnID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.usWStnID = (Integer)value;
      }
    });
    setters.put("wbanWStnID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.wbanWStnID = (Integer)value;
      }
    });
    setters.put("obsDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.obsDate = (java.sql.Date)value;
      }
    });
    setters.put("obsHour", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.obsHour = (String)value;
      }
    });
    setters.put("lat", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.lat = (String)value;
      }
    });
    setters.put("longi", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.longi = (String)value;
      }
    });
    setters.put("elevation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.elevation = (String)value;
      }
    });
    setters.put("wDirection", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.wDirection = (String)value;
      }
    });
    setters.put("WDir_qCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.WDir_qCode = (String)value;
      }
    });
    setters.put("SkyCeliengHeight", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.SkyCeliengHeight = (Integer)value;
      }
    });
    setters.put("sky_qcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.sky_qcode = (String)value;
      }
    });
    setters.put("vDist", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.vDist = (String)value;
      }
    });
    setters.put("vDist_qCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.vDist_qCode = (String)value;
      }
    });
    setters.put("airTemp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.airTemp = (Integer)value;
      }
    });
    setters.put("aTemp_qCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.aTemp_qCode = (String)value;
      }
    });
    setters.put("dewPt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.dewPt = (String)value;
      }
    });
    setters.put("dewPt_qCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.dewPt_qCode = (String)value;
      }
    });
    setters.put("atmPres", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.atmPres = (Integer)value;
      }
    });
    setters.put("atmP_qCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NCDC_1950.this.atmP_qCode = (String)value;
      }
    });
  }
  public NCDC_1950() {
    init0();
  }
  private Integer usWStnID;
  public Integer get_usWStnID() {
    return usWStnID;
  }
  public void set_usWStnID(Integer usWStnID) {
    this.usWStnID = usWStnID;
  }
  public NCDC_1950 with_usWStnID(Integer usWStnID) {
    this.usWStnID = usWStnID;
    return this;
  }
  private Integer wbanWStnID;
  public Integer get_wbanWStnID() {
    return wbanWStnID;
  }
  public void set_wbanWStnID(Integer wbanWStnID) {
    this.wbanWStnID = wbanWStnID;
  }
  public NCDC_1950 with_wbanWStnID(Integer wbanWStnID) {
    this.wbanWStnID = wbanWStnID;
    return this;
  }
  private java.sql.Date obsDate;
  public java.sql.Date get_obsDate() {
    return obsDate;
  }
  public void set_obsDate(java.sql.Date obsDate) {
    this.obsDate = obsDate;
  }
  public NCDC_1950 with_obsDate(java.sql.Date obsDate) {
    this.obsDate = obsDate;
    return this;
  }
  private String obsHour;
  public String get_obsHour() {
    return obsHour;
  }
  public void set_obsHour(String obsHour) {
    this.obsHour = obsHour;
  }
  public NCDC_1950 with_obsHour(String obsHour) {
    this.obsHour = obsHour;
    return this;
  }
  private String lat;
  public String get_lat() {
    return lat;
  }
  public void set_lat(String lat) {
    this.lat = lat;
  }
  public NCDC_1950 with_lat(String lat) {
    this.lat = lat;
    return this;
  }
  private String longi;
  public String get_longi() {
    return longi;
  }
  public void set_longi(String longi) {
    this.longi = longi;
  }
  public NCDC_1950 with_longi(String longi) {
    this.longi = longi;
    return this;
  }
  private String elevation;
  public String get_elevation() {
    return elevation;
  }
  public void set_elevation(String elevation) {
    this.elevation = elevation;
  }
  public NCDC_1950 with_elevation(String elevation) {
    this.elevation = elevation;
    return this;
  }
  private String wDirection;
  public String get_wDirection() {
    return wDirection;
  }
  public void set_wDirection(String wDirection) {
    this.wDirection = wDirection;
  }
  public NCDC_1950 with_wDirection(String wDirection) {
    this.wDirection = wDirection;
    return this;
  }
  private String WDir_qCode;
  public String get_WDir_qCode() {
    return WDir_qCode;
  }
  public void set_WDir_qCode(String WDir_qCode) {
    this.WDir_qCode = WDir_qCode;
  }
  public NCDC_1950 with_WDir_qCode(String WDir_qCode) {
    this.WDir_qCode = WDir_qCode;
    return this;
  }
  private Integer SkyCeliengHeight;
  public Integer get_SkyCeliengHeight() {
    return SkyCeliengHeight;
  }
  public void set_SkyCeliengHeight(Integer SkyCeliengHeight) {
    this.SkyCeliengHeight = SkyCeliengHeight;
  }
  public NCDC_1950 with_SkyCeliengHeight(Integer SkyCeliengHeight) {
    this.SkyCeliengHeight = SkyCeliengHeight;
    return this;
  }
  private String sky_qcode;
  public String get_sky_qcode() {
    return sky_qcode;
  }
  public void set_sky_qcode(String sky_qcode) {
    this.sky_qcode = sky_qcode;
  }
  public NCDC_1950 with_sky_qcode(String sky_qcode) {
    this.sky_qcode = sky_qcode;
    return this;
  }
  private String vDist;
  public String get_vDist() {
    return vDist;
  }
  public void set_vDist(String vDist) {
    this.vDist = vDist;
  }
  public NCDC_1950 with_vDist(String vDist) {
    this.vDist = vDist;
    return this;
  }
  private String vDist_qCode;
  public String get_vDist_qCode() {
    return vDist_qCode;
  }
  public void set_vDist_qCode(String vDist_qCode) {
    this.vDist_qCode = vDist_qCode;
  }
  public NCDC_1950 with_vDist_qCode(String vDist_qCode) {
    this.vDist_qCode = vDist_qCode;
    return this;
  }
  private Integer airTemp;
  public Integer get_airTemp() {
    return airTemp;
  }
  public void set_airTemp(Integer airTemp) {
    this.airTemp = airTemp;
  }
  public NCDC_1950 with_airTemp(Integer airTemp) {
    this.airTemp = airTemp;
    return this;
  }
  private String aTemp_qCode;
  public String get_aTemp_qCode() {
    return aTemp_qCode;
  }
  public void set_aTemp_qCode(String aTemp_qCode) {
    this.aTemp_qCode = aTemp_qCode;
  }
  public NCDC_1950 with_aTemp_qCode(String aTemp_qCode) {
    this.aTemp_qCode = aTemp_qCode;
    return this;
  }
  private String dewPt;
  public String get_dewPt() {
    return dewPt;
  }
  public void set_dewPt(String dewPt) {
    this.dewPt = dewPt;
  }
  public NCDC_1950 with_dewPt(String dewPt) {
    this.dewPt = dewPt;
    return this;
  }
  private String dewPt_qCode;
  public String get_dewPt_qCode() {
    return dewPt_qCode;
  }
  public void set_dewPt_qCode(String dewPt_qCode) {
    this.dewPt_qCode = dewPt_qCode;
  }
  public NCDC_1950 with_dewPt_qCode(String dewPt_qCode) {
    this.dewPt_qCode = dewPt_qCode;
    return this;
  }
  private Integer atmPres;
  public Integer get_atmPres() {
    return atmPres;
  }
  public void set_atmPres(Integer atmPres) {
    this.atmPres = atmPres;
  }
  public NCDC_1950 with_atmPres(Integer atmPres) {
    this.atmPres = atmPres;
    return this;
  }
  private String atmP_qCode;
  public String get_atmP_qCode() {
    return atmP_qCode;
  }
  public void set_atmP_qCode(String atmP_qCode) {
    this.atmP_qCode = atmP_qCode;
  }
  public NCDC_1950 with_atmP_qCode(String atmP_qCode) {
    this.atmP_qCode = atmP_qCode;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof NCDC_1950)) {
      return false;
    }
    NCDC_1950 that = (NCDC_1950) o;
    boolean equal = true;
    equal = equal && (this.usWStnID == null ? that.usWStnID == null : this.usWStnID.equals(that.usWStnID));
    equal = equal && (this.wbanWStnID == null ? that.wbanWStnID == null : this.wbanWStnID.equals(that.wbanWStnID));
    equal = equal && (this.obsDate == null ? that.obsDate == null : this.obsDate.equals(that.obsDate));
    equal = equal && (this.obsHour == null ? that.obsHour == null : this.obsHour.equals(that.obsHour));
    equal = equal && (this.lat == null ? that.lat == null : this.lat.equals(that.lat));
    equal = equal && (this.longi == null ? that.longi == null : this.longi.equals(that.longi));
    equal = equal && (this.elevation == null ? that.elevation == null : this.elevation.equals(that.elevation));
    equal = equal && (this.wDirection == null ? that.wDirection == null : this.wDirection.equals(that.wDirection));
    equal = equal && (this.WDir_qCode == null ? that.WDir_qCode == null : this.WDir_qCode.equals(that.WDir_qCode));
    equal = equal && (this.SkyCeliengHeight == null ? that.SkyCeliengHeight == null : this.SkyCeliengHeight.equals(that.SkyCeliengHeight));
    equal = equal && (this.sky_qcode == null ? that.sky_qcode == null : this.sky_qcode.equals(that.sky_qcode));
    equal = equal && (this.vDist == null ? that.vDist == null : this.vDist.equals(that.vDist));
    equal = equal && (this.vDist_qCode == null ? that.vDist_qCode == null : this.vDist_qCode.equals(that.vDist_qCode));
    equal = equal && (this.airTemp == null ? that.airTemp == null : this.airTemp.equals(that.airTemp));
    equal = equal && (this.aTemp_qCode == null ? that.aTemp_qCode == null : this.aTemp_qCode.equals(that.aTemp_qCode));
    equal = equal && (this.dewPt == null ? that.dewPt == null : this.dewPt.equals(that.dewPt));
    equal = equal && (this.dewPt_qCode == null ? that.dewPt_qCode == null : this.dewPt_qCode.equals(that.dewPt_qCode));
    equal = equal && (this.atmPres == null ? that.atmPres == null : this.atmPres.equals(that.atmPres));
    equal = equal && (this.atmP_qCode == null ? that.atmP_qCode == null : this.atmP_qCode.equals(that.atmP_qCode));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof NCDC_1950)) {
      return false;
    }
    NCDC_1950 that = (NCDC_1950) o;
    boolean equal = true;
    equal = equal && (this.usWStnID == null ? that.usWStnID == null : this.usWStnID.equals(that.usWStnID));
    equal = equal && (this.wbanWStnID == null ? that.wbanWStnID == null : this.wbanWStnID.equals(that.wbanWStnID));
    equal = equal && (this.obsDate == null ? that.obsDate == null : this.obsDate.equals(that.obsDate));
    equal = equal && (this.obsHour == null ? that.obsHour == null : this.obsHour.equals(that.obsHour));
    equal = equal && (this.lat == null ? that.lat == null : this.lat.equals(that.lat));
    equal = equal && (this.longi == null ? that.longi == null : this.longi.equals(that.longi));
    equal = equal && (this.elevation == null ? that.elevation == null : this.elevation.equals(that.elevation));
    equal = equal && (this.wDirection == null ? that.wDirection == null : this.wDirection.equals(that.wDirection));
    equal = equal && (this.WDir_qCode == null ? that.WDir_qCode == null : this.WDir_qCode.equals(that.WDir_qCode));
    equal = equal && (this.SkyCeliengHeight == null ? that.SkyCeliengHeight == null : this.SkyCeliengHeight.equals(that.SkyCeliengHeight));
    equal = equal && (this.sky_qcode == null ? that.sky_qcode == null : this.sky_qcode.equals(that.sky_qcode));
    equal = equal && (this.vDist == null ? that.vDist == null : this.vDist.equals(that.vDist));
    equal = equal && (this.vDist_qCode == null ? that.vDist_qCode == null : this.vDist_qCode.equals(that.vDist_qCode));
    equal = equal && (this.airTemp == null ? that.airTemp == null : this.airTemp.equals(that.airTemp));
    equal = equal && (this.aTemp_qCode == null ? that.aTemp_qCode == null : this.aTemp_qCode.equals(that.aTemp_qCode));
    equal = equal && (this.dewPt == null ? that.dewPt == null : this.dewPt.equals(that.dewPt));
    equal = equal && (this.dewPt_qCode == null ? that.dewPt_qCode == null : this.dewPt_qCode.equals(that.dewPt_qCode));
    equal = equal && (this.atmPres == null ? that.atmPres == null : this.atmPres.equals(that.atmPres));
    equal = equal && (this.atmP_qCode == null ? that.atmP_qCode == null : this.atmP_qCode.equals(that.atmP_qCode));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.usWStnID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.wbanWStnID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.obsDate = JdbcWritableBridge.readDate(3, __dbResults);
    this.obsHour = JdbcWritableBridge.readString(4, __dbResults);
    this.lat = JdbcWritableBridge.readString(5, __dbResults);
    this.longi = JdbcWritableBridge.readString(6, __dbResults);
    this.elevation = JdbcWritableBridge.readString(7, __dbResults);
    this.wDirection = JdbcWritableBridge.readString(8, __dbResults);
    this.WDir_qCode = JdbcWritableBridge.readString(9, __dbResults);
    this.SkyCeliengHeight = JdbcWritableBridge.readInteger(10, __dbResults);
    this.sky_qcode = JdbcWritableBridge.readString(11, __dbResults);
    this.vDist = JdbcWritableBridge.readString(12, __dbResults);
    this.vDist_qCode = JdbcWritableBridge.readString(13, __dbResults);
    this.airTemp = JdbcWritableBridge.readInteger(14, __dbResults);
    this.aTemp_qCode = JdbcWritableBridge.readString(15, __dbResults);
    this.dewPt = JdbcWritableBridge.readString(16, __dbResults);
    this.dewPt_qCode = JdbcWritableBridge.readString(17, __dbResults);
    this.atmPres = JdbcWritableBridge.readInteger(18, __dbResults);
    this.atmP_qCode = JdbcWritableBridge.readString(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.usWStnID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.wbanWStnID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.obsDate = JdbcWritableBridge.readDate(3, __dbResults);
    this.obsHour = JdbcWritableBridge.readString(4, __dbResults);
    this.lat = JdbcWritableBridge.readString(5, __dbResults);
    this.longi = JdbcWritableBridge.readString(6, __dbResults);
    this.elevation = JdbcWritableBridge.readString(7, __dbResults);
    this.wDirection = JdbcWritableBridge.readString(8, __dbResults);
    this.WDir_qCode = JdbcWritableBridge.readString(9, __dbResults);
    this.SkyCeliengHeight = JdbcWritableBridge.readInteger(10, __dbResults);
    this.sky_qcode = JdbcWritableBridge.readString(11, __dbResults);
    this.vDist = JdbcWritableBridge.readString(12, __dbResults);
    this.vDist_qCode = JdbcWritableBridge.readString(13, __dbResults);
    this.airTemp = JdbcWritableBridge.readInteger(14, __dbResults);
    this.aTemp_qCode = JdbcWritableBridge.readString(15, __dbResults);
    this.dewPt = JdbcWritableBridge.readString(16, __dbResults);
    this.dewPt_qCode = JdbcWritableBridge.readString(17, __dbResults);
    this.atmPres = JdbcWritableBridge.readInteger(18, __dbResults);
    this.atmP_qCode = JdbcWritableBridge.readString(19, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(usWStnID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(wbanWStnID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(obsDate, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(obsHour, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lat, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(longi, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(elevation, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(wDirection, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WDir_qCode, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SkyCeliengHeight, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(sky_qcode, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vDist, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vDist_qCode, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(airTemp, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(aTemp_qCode, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dewPt, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dewPt_qCode, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(atmPres, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(atmP_qCode, 19 + __off, 12, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(usWStnID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(wbanWStnID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(obsDate, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(obsHour, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lat, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(longi, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(elevation, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(wDirection, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WDir_qCode, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SkyCeliengHeight, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(sky_qcode, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vDist, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(vDist_qCode, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(airTemp, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(aTemp_qCode, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dewPt, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dewPt_qCode, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(atmPres, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(atmP_qCode, 19 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.usWStnID = null;
    } else {
    this.usWStnID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.wbanWStnID = null;
    } else {
    this.wbanWStnID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.obsDate = null;
    } else {
    this.obsDate = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.obsHour = null;
    } else {
    this.obsHour = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lat = null;
    } else {
    this.lat = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.longi = null;
    } else {
    this.longi = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.elevation = null;
    } else {
    this.elevation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.wDirection = null;
    } else {
    this.wDirection = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WDir_qCode = null;
    } else {
    this.WDir_qCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SkyCeliengHeight = null;
    } else {
    this.SkyCeliengHeight = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.sky_qcode = null;
    } else {
    this.sky_qcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.vDist = null;
    } else {
    this.vDist = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.vDist_qCode = null;
    } else {
    this.vDist_qCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.airTemp = null;
    } else {
    this.airTemp = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.aTemp_qCode = null;
    } else {
    this.aTemp_qCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dewPt = null;
    } else {
    this.dewPt = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dewPt_qCode = null;
    } else {
    this.dewPt_qCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.atmPres = null;
    } else {
    this.atmPres = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.atmP_qCode = null;
    } else {
    this.atmP_qCode = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.usWStnID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.usWStnID);
    }
    if (null == this.wbanWStnID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.wbanWStnID);
    }
    if (null == this.obsDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.obsDate.getTime());
    }
    if (null == this.obsHour) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, obsHour);
    }
    if (null == this.lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lat);
    }
    if (null == this.longi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, longi);
    }
    if (null == this.elevation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, elevation);
    }
    if (null == this.wDirection) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wDirection);
    }
    if (null == this.WDir_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WDir_qCode);
    }
    if (null == this.SkyCeliengHeight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SkyCeliengHeight);
    }
    if (null == this.sky_qcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sky_qcode);
    }
    if (null == this.vDist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vDist);
    }
    if (null == this.vDist_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vDist_qCode);
    }
    if (null == this.airTemp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.airTemp);
    }
    if (null == this.aTemp_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, aTemp_qCode);
    }
    if (null == this.dewPt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dewPt);
    }
    if (null == this.dewPt_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dewPt_qCode);
    }
    if (null == this.atmPres) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.atmPres);
    }
    if (null == this.atmP_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, atmP_qCode);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.usWStnID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.usWStnID);
    }
    if (null == this.wbanWStnID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.wbanWStnID);
    }
    if (null == this.obsDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.obsDate.getTime());
    }
    if (null == this.obsHour) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, obsHour);
    }
    if (null == this.lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lat);
    }
    if (null == this.longi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, longi);
    }
    if (null == this.elevation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, elevation);
    }
    if (null == this.wDirection) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wDirection);
    }
    if (null == this.WDir_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WDir_qCode);
    }
    if (null == this.SkyCeliengHeight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SkyCeliengHeight);
    }
    if (null == this.sky_qcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sky_qcode);
    }
    if (null == this.vDist) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vDist);
    }
    if (null == this.vDist_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vDist_qCode);
    }
    if (null == this.airTemp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.airTemp);
    }
    if (null == this.aTemp_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, aTemp_qCode);
    }
    if (null == this.dewPt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dewPt);
    }
    if (null == this.dewPt_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dewPt_qCode);
    }
    if (null == this.atmPres) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.atmPres);
    }
    if (null == this.atmP_qCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, atmP_qCode);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(usWStnID==null?"null":"" + usWStnID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wbanWStnID==null?"null":"" + wbanWStnID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(obsDate==null?"null":"" + obsDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(obsHour==null?"null":obsHour, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lat==null?"null":lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longi==null?"null":longi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevation==null?"null":elevation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wDirection==null?"null":wDirection, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WDir_qCode==null?"null":WDir_qCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SkyCeliengHeight==null?"null":"" + SkyCeliengHeight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sky_qcode==null?"null":sky_qcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vDist==null?"null":vDist, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vDist_qCode==null?"null":vDist_qCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airTemp==null?"null":"" + airTemp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(aTemp_qCode==null?"null":aTemp_qCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dewPt==null?"null":dewPt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dewPt_qCode==null?"null":dewPt_qCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(atmPres==null?"null":"" + atmPres, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(atmP_qCode==null?"null":atmP_qCode, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(usWStnID==null?"null":"" + usWStnID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wbanWStnID==null?"null":"" + wbanWStnID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(obsDate==null?"null":"" + obsDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(obsHour==null?"null":obsHour, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lat==null?"null":lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longi==null?"null":longi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevation==null?"null":elevation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wDirection==null?"null":wDirection, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WDir_qCode==null?"null":WDir_qCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SkyCeliengHeight==null?"null":"" + SkyCeliengHeight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sky_qcode==null?"null":sky_qcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vDist==null?"null":vDist, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vDist_qCode==null?"null":vDist_qCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airTemp==null?"null":"" + airTemp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(aTemp_qCode==null?"null":aTemp_qCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dewPt==null?"null":dewPt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dewPt_qCode==null?"null":dewPt_qCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(atmPres==null?"null":"" + atmPres, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(atmP_qCode==null?"null":atmP_qCode, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.usWStnID = null; } else {
      this.usWStnID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wbanWStnID = null; } else {
      this.wbanWStnID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.obsDate = null; } else {
      this.obsDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.obsHour = null; } else {
      this.obsHour = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lat = null; } else {
      this.lat = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.longi = null; } else {
      this.longi = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.elevation = null; } else {
      this.elevation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.wDirection = null; } else {
      this.wDirection = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.WDir_qCode = null; } else {
      this.WDir_qCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SkyCeliengHeight = null; } else {
      this.SkyCeliengHeight = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sky_qcode = null; } else {
      this.sky_qcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.vDist = null; } else {
      this.vDist = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.vDist_qCode = null; } else {
      this.vDist_qCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.airTemp = null; } else {
      this.airTemp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.aTemp_qCode = null; } else {
      this.aTemp_qCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dewPt = null; } else {
      this.dewPt = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dewPt_qCode = null; } else {
      this.dewPt_qCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.atmPres = null; } else {
      this.atmPres = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.atmP_qCode = null; } else {
      this.atmP_qCode = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.usWStnID = null; } else {
      this.usWStnID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wbanWStnID = null; } else {
      this.wbanWStnID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.obsDate = null; } else {
      this.obsDate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.obsHour = null; } else {
      this.obsHour = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lat = null; } else {
      this.lat = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.longi = null; } else {
      this.longi = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.elevation = null; } else {
      this.elevation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.wDirection = null; } else {
      this.wDirection = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.WDir_qCode = null; } else {
      this.WDir_qCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SkyCeliengHeight = null; } else {
      this.SkyCeliengHeight = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sky_qcode = null; } else {
      this.sky_qcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.vDist = null; } else {
      this.vDist = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.vDist_qCode = null; } else {
      this.vDist_qCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.airTemp = null; } else {
      this.airTemp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.aTemp_qCode = null; } else {
      this.aTemp_qCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dewPt = null; } else {
      this.dewPt = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dewPt_qCode = null; } else {
      this.dewPt_qCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.atmPres = null; } else {
      this.atmPres = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.atmP_qCode = null; } else {
      this.atmP_qCode = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    NCDC_1950 o = (NCDC_1950) super.clone();
    o.obsDate = (o.obsDate != null) ? (java.sql.Date) o.obsDate.clone() : null;
    return o;
  }

  public void clone0(NCDC_1950 o) throws CloneNotSupportedException {
    o.obsDate = (o.obsDate != null) ? (java.sql.Date) o.obsDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("usWStnID", this.usWStnID);
    __sqoop$field_map.put("wbanWStnID", this.wbanWStnID);
    __sqoop$field_map.put("obsDate", this.obsDate);
    __sqoop$field_map.put("obsHour", this.obsHour);
    __sqoop$field_map.put("lat", this.lat);
    __sqoop$field_map.put("longi", this.longi);
    __sqoop$field_map.put("elevation", this.elevation);
    __sqoop$field_map.put("wDirection", this.wDirection);
    __sqoop$field_map.put("WDir_qCode", this.WDir_qCode);
    __sqoop$field_map.put("SkyCeliengHeight", this.SkyCeliengHeight);
    __sqoop$field_map.put("sky_qcode", this.sky_qcode);
    __sqoop$field_map.put("vDist", this.vDist);
    __sqoop$field_map.put("vDist_qCode", this.vDist_qCode);
    __sqoop$field_map.put("airTemp", this.airTemp);
    __sqoop$field_map.put("aTemp_qCode", this.aTemp_qCode);
    __sqoop$field_map.put("dewPt", this.dewPt);
    __sqoop$field_map.put("dewPt_qCode", this.dewPt_qCode);
    __sqoop$field_map.put("atmPres", this.atmPres);
    __sqoop$field_map.put("atmP_qCode", this.atmP_qCode);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("usWStnID", this.usWStnID);
    __sqoop$field_map.put("wbanWStnID", this.wbanWStnID);
    __sqoop$field_map.put("obsDate", this.obsDate);
    __sqoop$field_map.put("obsHour", this.obsHour);
    __sqoop$field_map.put("lat", this.lat);
    __sqoop$field_map.put("longi", this.longi);
    __sqoop$field_map.put("elevation", this.elevation);
    __sqoop$field_map.put("wDirection", this.wDirection);
    __sqoop$field_map.put("WDir_qCode", this.WDir_qCode);
    __sqoop$field_map.put("SkyCeliengHeight", this.SkyCeliengHeight);
    __sqoop$field_map.put("sky_qcode", this.sky_qcode);
    __sqoop$field_map.put("vDist", this.vDist);
    __sqoop$field_map.put("vDist_qCode", this.vDist_qCode);
    __sqoop$field_map.put("airTemp", this.airTemp);
    __sqoop$field_map.put("aTemp_qCode", this.aTemp_qCode);
    __sqoop$field_map.put("dewPt", this.dewPt);
    __sqoop$field_map.put("dewPt_qCode", this.dewPt_qCode);
    __sqoop$field_map.put("atmPres", this.atmPres);
    __sqoop$field_map.put("atmP_qCode", this.atmP_qCode);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
