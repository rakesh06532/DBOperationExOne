package DBCon;

import java.util.*;
import java.sql.*;

public class DBCon4 {
	public static void main(String[] args) {
		try
		{
			PoolingConnection pc=new PoolingConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			pc.createConnection();
			
			System.out.println("===User-1====");
			Connection con=pc.useConnection();
			System.out.println("User-1 "+con);
			System.out.println("size of pool "+pc.v.size());
			
			Connection con2=pc.useConnection();
			System.out.println("===User-2===="+con2);
			System.out.println("size of pool "+pc.v.size());
			
			System.out.println("===User-1====");
			pc.returnConnection(con);
			System.out.println("size of pool "+pc.v.size());
			
			System.out.println("===User-2====");
			pc.returnConnection(con2);
			System.out.println("size of pool "+pc.v.size());
			
			System.out.println("=========Display Connection======== ");
			
			Iterator<Connection> it=pc.v.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}catch(Exception e) {e.printStackTrace();}
	}

}
