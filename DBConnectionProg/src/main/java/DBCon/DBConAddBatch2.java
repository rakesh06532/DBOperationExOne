package DBCon;

import java.sql.*;
import java.util.*;

public class DBConAddBatch2 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps=con.prepareStatement("insert into empdata49 values(?,?,?)");
			System.out.println("How many employee you want to insert");
			int n=Integer.parseInt(sc.nextLine());
			
			for(int i=1;i<=n;i++)
			{
				System.out.println("Enter "+i+"st "+"Employee details");
				System.out.println("Enter employee id");
				String eid=sc.nextLine();
				System.out.println("Enter employee name");
				String eName=sc.nextLine();
				System.out.println("Enter employee designation ");
				String edesg=sc.nextLine();
				
				ps.setString(1, eid);
				ps.setString(2, eName);
				ps.setString(3, edesg);
				
				ps.addBatch();
				
			}//end batch
			
			int k[]=ps.executeBatch();
			for(int i=1;i<=k.length;i++)
			{
				System.out.println("Data inserted successfully...");
			}
			ps.close();
			con.close();
			sc.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
