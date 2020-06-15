from datetime import date,datetime,timedelta
import pymysql

cnx=pymysql.connect(user='root',database='perbankan')
cursor=cnx.cursor()
query= "SELECT*FROM nasabah"
cursor.execute(query)
output = cursor.fetchall()
for x in output:
    print(x)
cursor.close()
cnx.close()
