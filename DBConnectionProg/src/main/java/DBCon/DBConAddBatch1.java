package DBCon;

import java.sql.*;
import java.util.*;

public class DBConAddBatch1 {
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement stm=con.createStatement();
			System.out.println("Enter employee id");
			String eid=sc.nextLine();
			System.out.println("Enter employee name");
			String ename=sc.nextLine();
			System.out.println("Enter designation ");
			String edesg=sc.nextLine();
			System.out.println("Enter book code");
			String bcode=sc.nextLine();
			System.out.println("Enter book name");
			String bname=sc.nextLine();
			System.out.println("Enter book author");
			String bauthor=sc.nextLine();
			System.out.println("Enter price");
			int bprice=Integer.parseInt(sc.nextLine());
			System.out.println("Enter quantity");
			int bqty=Integer.parseInt(sc.nextLine());
			
			stm.addBatch
			("insert into empdata49 values('"+eid+"','"+ename+"','"+edesg+"')");
			
			stm.addBatch
			("insert into bookdetails49 values('"+bcode+"','"+bname+"','"+bauthor+"',"+bprice+","+bqty+")");
			
			int k[]=stm.executeBatch();
			
			for(int i=0;i<k.length;i++)
			{
				System.out.println("Data inserted successfully...");
			}
			stm.clearBatch();
			con.close();
			sc.close();
		}catch(Exception e) {e.printStackTrace();};
	}

}
