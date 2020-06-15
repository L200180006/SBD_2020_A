from datetime import date,datetime,timedelta
import pymysql

cnx=pymysql.connect(user='root',database='perbankan')
cursor=cnx.cursor()
query= "UPDATE transaksi SET jumlah=250000 where no_transaksi=50"
cursor.execute(query)
cnx.commit()
cursor.close()
cnx.close()
