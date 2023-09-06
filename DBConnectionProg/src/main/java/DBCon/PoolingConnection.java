package DBCon;

import java.util.*;
import java.sql.*;

public class PoolingConnection {
	String url,uName,pWord;
	public PoolingConnection(String url,String uName,String pWord)
	{
		this.url=url;
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
				Connection con=DriverManager.getConnection(url,uName,pWord);
				v.add(con);//adding connection object to pool
				System.out.println(con);
			}//end of loop
			
			if(v.size()==5)
			{
				System.out.println("Pool is full...");
			}
		}catch(Exception e) {e.printStackTrace();}
	}//end of method
	public Connection useConnection()
	{
	Connection con=v.firstElement();
	v.remove(0);
	return con;
	}
	
	public void returnConnection(Connection con)
	{
		v.addElement(con);
		System.out.println("Connection added back to pool...");
	}

}
