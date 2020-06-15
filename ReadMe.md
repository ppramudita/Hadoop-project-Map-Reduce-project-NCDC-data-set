 # To find maximum temparature in NCDC dataset for years 1950 and 1986

This project is subdivided into 4 phases, Below are the results for all the phases:

## Phase 1 : Steps to reproduce :

```
Step 1 : Add below ports to vagrant file
        config.vm.network "forwarded_port", guest: 8088, host: 8088 
        config.vm.network "forwarded_port", guest: 19888, host: 19888 
        config.vm.network "forwarded_port", guest: 50070, host: 50070
Step 2 : Modify the value "localhost" in ~/hadoop-2.8.5/etc/hadoop/yarn-site.xml to  0.0.0.0    
Step 3 : Exit from VM and run command : vagrant reload --provision
step 4 : Login to VM by vagrant ssh and start all the services
step 5 : create folder structure under hadoop filesystem, I have created two folders as 
         a)ppramudita/ncdc/1950 b) ppramudita/ncdc/1986 ,command to create the folder:
         >hadoop fs -mkdir -p /ppramudita/ncdc/1950 
         >hadoop fs -mkdir -p /ppramudita/ncdc/1986
step 6: Copied both files to the above directory using below command :
        hadoop fs -copyFromLocal /home/vagrant/1950.txt /ppramudita/ncdc/1950 and extract both the files using command : xz -dvk filename
step 7: compile the MaxTemperature code present in hadoop-book using below steps :
        a)Navigate to main folder under hadoop-book and compile the code using : hadoop com.sun.tools.javac.Main MaxTemperature.java
        b)create a jar file : jar cf maxt.jar MaxTemperature*.class  (here maxt is name of my  jar file)
        c)run the command to execute the code :  hadoop jar maxt.jar MaxTemperature /ppramudita/ncdc/1950/1950.txt /output/ncdc/1950Op1
step 8: check the output in folder : part-r-00000 , command to see the o/p : hadoop fs -cat /output/ncdc/1950Op1/part-r-00000/
        similarly, run the above command in step 7 to find the max temp on 1986.txt.
```       
---
## Screen shot of result file - (part-r-00000)

### 1950.txt output
![1950.txt](/images/1950.PNG "1950")

### 1986.txt Output
![1986.txt](/images/1986.PNG "1986")

---

## Phase 2 : Steps to reproduce :

```
Step 1 : create folder in hadoop filesystem as : ppramudita/ncdc/5086
Step 2 : concatenate both the files 1950.txt and 1986.txt into a single file 5086.txt
         Command : hadoop fs -cat /ppramudita/ncdc/1950/1950.txt /ppramudita/ncdc/1986/1986.txt | hadoop fs -put - /ppramudita/ncdc/5086/5086.txt
         
Step 3 : After concatenating both the files , run step 7 and step 8 as followed in phase 1

```
---
## Screen shot of result file(5086.txt) - (part-r-00000)

### 5086.txt output
![5086.txt](/images/5086.PNG "5086")

---
## Phase 3 : Steps to reproduce

```
Step 1: install mysql server on VM by following the steps in hadoop-guide ,
Step 2: After succeeful installation created and inserted records to the table through python code , 
        below is the screen shot of DB schema and code result on sample.txt(for testing the code) 
        :for DB schema referred text book (Initially inserted the data through Java code ,but it took lot of time ,so done it through python for the 2nd time)
Below are the steps followed to run python code :
a)Python script file(dataInsert1950.py) (dataInsert1986.py) ,(dataInsert1950_1986.py) is placed under itmd-521/week-05 of my github repository.
b)place the python file in virtual machine , Path : ~/PragyaPython and also palce 1950.txt,1986.txt and 5086.txt under the same folder where python file is placed
c)connect to using command : sudo mysql -u root -p and enter password : hadoop123
d)create database by name "NCDCTemperatureDb"
e)Execute command "python dataInsert1950.py" to run the code and similarly run the other files using command "python dataInsert1986.py" and "python dataInsert1950_1986.py"
f)after execution check the DB for tables NCDC_1950,NCDC_1986,NCDC_1950_1986 that all records from text file should be populated in respective tables.
Step3: python file "MaxTemp50.py" , "MaxTemp86.py" , "MaxTemp5086.py" to find the maximum temperature is placed under itmd-521/week-05 repository.
Step 4 : place all the python file under vitural machine , path : ~/PragyaPython
Step 5 : Execute command "python MaxTemp50.py" to run the code and similarly run the other files using command "python MaxTemp86.py" and "python MaxTemp5086,.py"

```
---
## Screen shot DB schema

### DB schema for table NCDC_1950 ( 1950.txt file) 
    file size : 2.16 GB ,Time taken to insert all records into mysql DB : 1 hr , 10 mins
![DB Schema_NCDC_1950](/images/1950_Schema.PNG "1950_Schema") 

### DB schema for table NCDC_1986 ( 1986.txt file) 
![DB schema_NCDC_1986](/images/1986_Schema.PNG "1986_Schema") 

### DB schema for table NCDC_1950_1986 ( 1986.txt file and 1950.txt file combined together) 
![DB schema_NCDC_1950_1986](/images/5086_Schema.PNG "5086_Schema.PNG") 


### Max temp for 1950
![Max_Temp_1950](/images/MaxTemp1950.PNG "MaxTemp1950") 

### Max temp for 1986
![Max_Temp_1986](/images/MaxTemp1986.PNG "MaxTemp1986.PNG")

### Max temp for 1986 and 1950
![Max_Temp_1950_1986](/images/MaxTemp5086.PNG "MaxTemp5086")


---

## Phase 4 : Steps to reproduce


1)Used SQOOP to bring the NCDC_1950 table data into hdfs file system, using --direct option as mysql is natively supported by Sqoop
```
  sqoop import --connect jdbc:mysql://127.0.0.1/NCDCTemperatureDb --username root --password hadoop123 --table NCDC_1950 --m 1 --direct
```
2) Using the MaxWidgetId.Java example from the Hadoop book, modified the code to compare Air Temperature of the NCDC data and get maximum temperature value. Then by following below instructions compiled this code along  with NCDC_1950.java created by the command in step 1 into a jar file.
```
hadoop com.sun.tools.javac.Main NCDC_1950.java MaxTSqoop.java
jar cf mt2.jar MaxTSqoop*.class NCDC_1950*.class
```

3) Finally ran the below command using the jar and file created in step 2 to run the Hadoop job and get the record where Temperature is max as shown in the screenshots.
```
HADOOP_CLASSPATH=$SQOOP_HOME/sqoop-1.4.7.jar hadoop jar mt2.jar MaxTSqoop -libjars $SQOOP_HOME/sqoop-1.4.7.jar
```
4) View the output on HDFS in the folder maxtempSqoop using the below command. You would see the full record wherein the 6th number from last is the maximum air temperature which in our case is 494 for 1950 data as shown in the screenshots
```
hadoop fs -cat /user/$USER/maxtempSqoop/part-r-00000/
```
### Screen shot of sqoop job 
![SQOOP JOB Result](/images/Sqoop1.PNG "Sqoop1")
![SQOOP JOB Result](/images/Sqoop2.PNG "Sqoop2")
![SQOOP JOB Result](/images/Sqoop3.PNG "Sqoop3")
![SQOOP JOB Result](/images/Sqoop4.PNG "Sqoop4")
![SQOOP JOB Result](/images/Sqoop5.PNG "Sqoop5")
![SQOOP JOB Result](/images/Sqoop6.PNG "Sqoop6")
![SQOOP JOB Result](/images/Sqoop7.PNG "Sqoop7")






  
