package DBCon;

import java.util.*;
import java.sql.*;

public class Pooling {
	public String dbUrl,uName,pWord;
	public Pooling(String dbUrl,String uName, String pWord)
	{
		this.dbUrl=dbUrl;
		this.uName=uName;
		this.pWord=pWord;
	}
	public Vector<Connection> v=new Vector<Connection>();
	public void createConnection()
	{
		try {
			while(v.size()<5)
			{
				System.out.println("Pool is not full...");
				Connection con=DriverManager.getConnection
						(dbUrl,uName,pWord);
				v.add(con);
				System.out.println(con);
			}//end loop
			if(v.size()==5) {
				System.out.println("Pool is full...");
			}
		}catch(Exception e) {e.printStackTrace();}
	}
	public Connection useConnection() {
		Connection con=v.firstElement();
        v.remove(0);
        return con;
	}
	public void returnConnnection(Connection con) {
		v.addElement(con);
		System.out.println("Connection added back to pool...");
	}
	

}
