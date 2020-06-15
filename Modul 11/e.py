from datetime import date,datetime,timedelta
import pymysql

cnx=pymysql.connect(user='root',database='perbankan')
cursor=cnx.cursor()
query= "DELETE FROM transaksi where no_transaksi=50"
cursor.execute(query)
cnx.commit()
cursor.close()
cnx.close()
