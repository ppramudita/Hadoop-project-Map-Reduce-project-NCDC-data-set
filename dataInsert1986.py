import re
import sys
import MySQLdb
from datetime import date
db= MySQLdb.connect(host="localhost",     # host name
                     user="root",              # username
                     passwd="hadoop123",            # password
                     db="NCDCTemperatureDb")                   # name of the data base

cursor=db.cursor()
f = open("1986.txt","r") #

sql ="CREATE TABLE NCDC_1986 (usWStnID INT, wbanWStnID INT, obsDate DATE," 
sql+="obsHour VARCHAR(10), lat VARCHAR(10), longi VARCHAR(10), elevation VARCHAR(10),"  
sql+="wDirection VARCHAR(10), WDir_qCode VARCHAR(1),SkyCeliengHeight INT, sky_qcode varchar(1),"
sql+="vDist VARCHAR(6), vDist_qCode VARCHAR(1),airTemp INT, aTemp_qCode VARCHAR(1), dewPt VARCHAR(10),"
sql+="dewPt_qCode VARCHAR(1), atmPres INT, atmP_qCode VARCHAR(1))"
rows=cursor.execute(sql)
db.commit()
MISSING = "9999"
for line in f:
        tempid= line[0:4]
        usWStnID = line[4:10]
        wbanWStnID= line[10:15]
        obsDate=line[15:23]
        obsHour=line[23:27]
        lat=line[28:34]
        longi=line[34:41]
        elevation=line[46:51]
        wDirection=line[60:63]
        WDir_qCode=line[63]
        SkyCeliengHeight= line[70:75]
        sky_qcode= line[76]
        vDist=line[78:84]
        vDist_qCode=line[84]
        if(line[87] == '+'):
            airTemp=line[88:92]
        else:
            airTemp=line[87:92]
        aTemp_qCode=line[92]
        dewPt=line[93:98]
        dewPt_qCode=line[99]
        atmPres=line[99:104]
        atmP_qCode=line[104]
        mydate = date(int(obsDate[0:4]),int(obsDate[4:6]),int(obsDate[6:]))

        sql= "insert into NCDC_1986 VALUES('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')" %(usWStnID,wbanWStnID,\
                mydate,obsHour,lat,longi,elevation,wDirection,WDir_qCode,SkyCeliengHeight,sky_qcode,vDist,vDist_qCode,airTemp,aTemp_qCode,dewPt,\
                dewPt_qCode,atmPres,atmP_qCode)
        #print(sql)
        if (airTemp != MISSING and re.match("[01459]",aTemp_qCode)):
            rows=cursor.execute(sql)
            db.commit()
f.close()
db.close()
