package Test;

import java.sql.*;
import java.util.Scanner;

public class DBCProcedure3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{	
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			System.out.println("Enter student rollno");
			int rollno=Integer.parseInt(sc.nextLine());
			System.out.println("Enter name ");
			String name=sc.nextLine();
			System.out.println("Enter student class ");
			String sclass=sc.nextLine();
			System.out.println("Enter student house no");
			String hno=sc.nextLine();
			System.out.println("Enter student streen name");
			String sname=sc.nextLine();
			System.out.println("Enter sutdent city ");
			String city=sc.nextLine();
			System.out.println("Enter student state ");
			String state=sc.nextLine();
			System.out.println("Enter student pin code ");
			int pincode=Integer.parseInt(sc.nextLine());
			System.out.println("Enter student mailid ");
			String mail=sc.nextLine();
			System.out.println("Enter student phoneno ");
			long phno=Long.parseLong(sc.nextLine());
			System.out.println("Enter student English marks");
			int english=Integer.parseInt(sc.nextLine());
			System.out.println("Enter student Math marks");
			int math=Integer.parseInt(sc.nextLine());
			System.out.println("Enter student Science marks");
			int science=Integer.parseInt(sc.nextLine());
			System.out.println("Enter student social science marks");
			int socscience=Integer.parseInt(sc.nextLine());
			System.out.println("Enter student Hindi marks");
			int hindi=Integer.parseInt(sc.nextLine());
			System.out.println("Enter student Sanskrit marks");
			int sanskrit=Integer.parseInt(sc.nextLine());
			int totmarks=english+math+science+socscience+hindi+sanskrit;
			float percentage=totmarks/6;
			String grade="";
			if(english>35 && math>35 && science>35 && socscience>35 && hindi>35 && sanskrit>35)
			{
			if(percentage>=80)
			grade=grade+"A+";
			else if(percentage>=60)
				grade=grade+"A";
				else if(percentage>=45)
				grade=grade+"B+";
				else 
				grade=grade+"B";
				
			}
			else
				grade="Fail";
			
			//For compilation 
			CallableStatement cs=con.prepareCall
					("{call studentRegister49(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setInt(1, rollno);
			cs.setString(2, name);
			cs.setString(3, sclass);
			cs.setString(4, hno);
			cs.setString(5, sname);
			cs.setString(6, city);
			cs.setString(7, state);
			cs.setInt(8, pincode);
			cs.setString(9, mail);
			cs.setLong(10, phno);
			cs.setInt(11, english);
			cs.setInt(12, math);
			cs.setInt(13, science);
			cs.setInt(14, socscience);
			cs.setInt(15, hindi);
			cs.setInt(16, sanskrit);
			cs.setInt(17, totmarks);
			cs.setFloat(18, percentage);
			cs.setString(19, grade);
			
			cs.execute();
			System.out.println("Student details inserted successfully...");
			con.close();
			}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}
	
}
