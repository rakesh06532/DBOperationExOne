package Test;

import java.util.Scanner;
import java.sql.*;

public class DBCon6 {
	
	public static void executeDB()
	{
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps=con.prepareStatement("select * from emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(3));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void executeDBUpdate()
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		PreparedStatement ps=con.prepareStatement("update emp set sal=sal+sal*0.1 where empno=?");
		System.out.println("Enter empno ");
		int empno=Integer.parseInt(sc.nextLine());
		ps.setInt(1, empno);
		
		int k=ps.executeUpdate();
		if(k>0)
			System.out.println("salary updated...");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}
	public static void executeDBQuery()
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		PreparedStatement ps=con.prepareStatement("select * from emp where empno=?");
		System.out.println("Enter empno ");
		int empno=Integer.parseInt(sc.nextLine());
		ps.setInt(1, empno);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}
	public static void insertDBQuery()
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?,?)");
			System.out.println("Enter empno: ");
			int empno=Integer.parseInt(sc.nextLine());
			System.out.println("Enter empname: ");
			String empname=sc.nextLine();
			System.out.println("Enter empJob: ");
			String empjob=sc.nextLine();
			System.out.println("Enter empMGR: ");
			int empMGR=Integer.parseInt(sc.nextLine());
			System.out.println("Enter emp hire date: ");
			String hiredate=sc.nextLine();
			System.out.println("Enter sal: ");
			float sal=Float.parseFloat(sc.nextLine());
			System.out.println("Enter commition: ");
			float comm=Float.parseFloat(sc.nextLine());
			System.out.println("Enter dept: ");
			int dept=Integer.parseInt(sc.nextLine());
			float annualsal=sal*12;
			
			ps.setInt(1, empno);
			ps.setString(2, empname);
			ps.setString(3, empjob);
			ps.setInt(4, empMGR);
			ps.setString(5, hiredate);
			ps.setFloat(6, sal);
			ps.setFloat(7, comm);
			ps.setInt(8, dept);
			ps.setFloat(9, annualsal);
			
			int k=ps.executeUpdate();
			if(k>0)
				System.out.println("Inserted successfully...");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}
	public static void deleteDBQuery()
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			
		
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		PreparedStatement ps=con.prepareStatement("delete from emp where empno=?");
		System.out.println("Enter empno: ");
		int empno=Integer.parseInt(sc.nextLine());
		ps.setInt(1, empno);
		int k=ps.executeUpdate();
		if(k>0)
			System.out.println("Employee deleted successfully...");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}
	public static void main(String[] args) {
	//	executeDB();
		//executeDBUpdate();
		//executeDBQuery();
		//insertDBQuery();
		deleteDBQuery();
	}

}
