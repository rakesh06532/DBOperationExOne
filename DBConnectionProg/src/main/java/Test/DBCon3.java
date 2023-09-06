package Test;

import java.sql.*;
import java.util.Scanner;

public class DBCon3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement stm=con.createStatement();
//			ResultSet rs1=stm.executeQuery("");
//			ResultSet rs2=stm.executeQuery("");
			System.out.println("=======Enter choice======");
			System.out.println("1 For Register \n2 For Insert");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			case 1: 	
			System.out.println("Enter sid");
			String sid=sc.nextLine();
			System.out.println("Enter ename");
			String ename=sc.nextLine();
			System.out.println("Enter edesg");
			String edesg=sc.nextLine();
			System.out.println("Enter bsal");
			float bsal=Float.parseFloat(sc.nextLine());
			float tsal=bsal+bsal*0.93f+(bsal*0.61f);
			int k=stm.executeUpdate
					("insert into employee50 values('"+sid+"','"+ename+"','"+edesg+"',"+bsal+","+tsal+")");
			if(k>0)
				System.out.println("employee details inserted successfully..."); 
			break;
			case 2: 
				ResultSet rs=stm.executeQuery("select * from employee50");
				while(rs.next())
				{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getFloat(5));
				}
			break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}

}
