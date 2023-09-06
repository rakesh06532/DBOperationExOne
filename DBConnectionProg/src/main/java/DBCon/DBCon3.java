package DBCon;

import java.sql.*;
import java.util.*;

public class DBCon3 {
	public static void main(String[] args) {
		try
		{
			Pooling ob=new Pooling
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			ob.createConnection();
			System.out.println("====User-1=====");
			Connection con=ob.useConnection();
			System.out.println("User-1 :"+con);
			System.out.println("size of pool: "+ob.v.size());
			
			System.out.println("======User-2======");
			Connection con2=ob.useConnection();
			System.out.println("User2: "+con2);
			System.out.println("size of pool: "+ob.v.size());
			System.out.println("======User-1======");
			ob.returnConnnection(con);
			System.out.println("size of pool: "+ob.v.size());
			System.out.println("======User-2======");
			ob.returnConnnection(con2);
			System.out.println("size of pool: "+ob.v.size());
			System.out.println("========Display Connection=========");
			
			Iterator<Connection> it=ob.v.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}catch(Exception e) {e.printStackTrace();}
	}

}
