package Test;

import java.sql.*;
import java.util.Scanner;

public class DBCProcedure1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			System.out.println("Enter Employee id");
			String eid=sc.nextLine();
			System.out.println("Enter Employee name");
			String ename=sc.nextLine();
			System.out.println("Enter Employee designation ");
			String edesg=sc.nextLine();
			System.out.println("Enter Employee house number");
			String hno=sc.nextLine();
			System.out.println("Enter Employee street name");
			String sname=sc.nextLine();
			System.out.println("Enter Employee city");
			String city=sc.nextLine();
			System.out.println("Enter Employee state");
			String state=sc.nextLine();
			System.out.println("Enter Employee pin code");
			int pincode=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee mail id");
			String mailid=sc.nextLine();
			System.out.println("Enter Employee Phone number");
			long phno=Long.parseLong(sc.nextLine());
			System.out.println("Enter Employee basic salary");
			float bsal=Float.parseFloat(sc.nextLine());
			float totsal=bsal+bsal*0.93f+bsal*0.61f;
			
			//For compilation 
			CallableStatement cs=con.prepareCall("{call empRegister49(?,?,?,?,?,?,?,?,?,?,?,?)}");
			
			//Loading data to callableStatement object
			cs.setString(1, eid);
			cs.setString(2, ename);
			cs.setString(3, edesg);
			cs.setString(4, hno);
			cs.setString(5, sname);
			cs.setString(6, city);
			cs.setString(7, state);
			cs.setInt(8, pincode);
			cs.setString(9, mailid);
			cs.setLong(10, phno);
			cs.setFloat(11, bsal);
			cs.setFloat(12, totsal);
			
			cs.execute();
			System.out.println("Employee Details Inserted Successfully...");
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}

}
