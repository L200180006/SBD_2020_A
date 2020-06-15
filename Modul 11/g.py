from datetime import date,datetime,timedelta
import pymysql

cnx=pymysql.connect(user='root',database='perbankan')
cursor=cnx.cursor()
query= """SELECT*FROM nasabah WHERE nasabah.id_nasabah IN
        (SELECT transaksi.id_nasabahFK FROM transaksi WHERE tanggal
        BETWEEN '2009-10-1' AND '2009-12-30')"""

cursor.execute(query)
output = cursor.fetchall()
for x in output:
    print(x)
cursor.close()
cnx.close()
