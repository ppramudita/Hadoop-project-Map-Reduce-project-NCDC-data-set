import re
import sys
import MySQLdb
db= MySQLdb.connect(host="localhost",     # host name
                     user="root",              # username
                     passwd="hadoop123",            # password
                     db="NCDCTemperatureDb")                   # name of the data base

cursor=db.cursor()

#table = "NCDC_5086"
sql= "select substring(obsDate,1,4) as Year,max(airTemp) from NCDC_5086 group by Year"  #+ table

#SELECT max(AirTemperature) FROM NCDC_1950 WHERE QualityCode4 REGEXP '[01459]'; 
#select AirTemperature,ObservationDate from NCDC_1950 where AirTemperature = (select max(AirTemperature) from NCDC_1950);
rows=cursor.execute(sql)
#db.commit()
result_set = cursor.fetchall()
print("Year\tAirTemp")
for row in result_set:

    print( "%s\t%s" % (row[0],row[1]))

db.close()


