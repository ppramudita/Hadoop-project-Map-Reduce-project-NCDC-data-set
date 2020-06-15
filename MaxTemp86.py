import re
import sys
import MySQLdb
db= MySQLdb.connect(host="localhost",     # host name
                     user="root",              # username
                     passwd="hadoop123",            # password
                     db="NCDCTemperatureDb")                   # name of the data base

cursor=db.cursor()

#table = "NCDC_1986"
sql= "select distinct substring(obsDate,1,4) as Year,airTemp from NCDC_1986 where airtemp = (select distinct max(airTemp) from NCDC_1986)" #+ table

#SELECT max(AirTemperature) FROM NCDC_1950 WHERE QualityCode4 REGEXP '[01459]'; 
#select AirTemperature,ObservationDate from NCDC_1950 where AirTemperature = (select max(AirTemperature) from NCDC_1950);
rows=cursor.execute(sql)
#db.commit()
result_set = cursor.fetchall()
print("Year\tAirTemp")
for row in result_set:

    print( "%s\t%s" % (row[0],row[1]))

db.close()


