package Test;

import java.sql.*;
import java.util.Scanner;

public class DBCProcedure4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			System.out.println("Enter Student rollno");
			int rollno=sc.nextInt();
			
			CallableStatement cs=con.prepareCall
					("{call studentRetrieve49(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			
			cs.setInt(1, rollno);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.registerOutParameter(4, Types.VARCHAR);
			cs.registerOutParameter(5, Types.VARCHAR);
			cs.registerOutParameter(6, Types.VARCHAR);
			cs.registerOutParameter(7, Types.VARCHAR);
			cs.registerOutParameter(8, Types.INTEGER);
			cs.registerOutParameter(9, Types.VARCHAR);
			cs.registerOutParameter(10, Types.INTEGER);
			cs.registerOutParameter(11, Types.INTEGER);
			cs.registerOutParameter(12, Types.INTEGER);
			cs.registerOutParameter(13, Types.INTEGER);
			cs.registerOutParameter(14, Types.INTEGER);
			cs.registerOutParameter(15, Types.INTEGER);
			cs.registerOutParameter(16, Types.INTEGER);
			cs.registerOutParameter(17, Types.INTEGER);
			cs.registerOutParameter(18, Types.VARCHAR);
			cs.registerOutParameter(19, Types.VARCHAR);
			
			cs.execute();
			
			System.out.println("rollno: "+rollno);
			System.out.println("Name: "+cs.getString(2));
			System.out.println("Class: "+cs.getString(3));
			System.out.println("House no: "+cs.getString(4));
			System.out.println("Street name: "+cs.getString(5));
			System.out.println("City: "+cs.getString(6));
			System.out.println("State: "+cs.getString(7));
			System.out.println("Pincode: "+cs.getInt(8));
			System.out.println("MailId: "+cs.getString(9));
			System.out.println("PhNo: "+cs.getLong(10));
			System.out.println("English: "+cs.getInt(11));
			System.out.println("Math: "+cs.getInt(12));
			System.out.println("Science: "+cs.getInt(13));
			System.out.println("social Science: "+cs.getInt(14));
			System.out.println("Hindi: "+cs.getInt(15));
			System.out.println("Sanskrit: "+cs.getInt(16));
			System.out.println("Total Marks: "+cs.getInt(17));
			System.out.println("Percentage: "+cs.getString(18));
			System.out.println("Grade: "+cs.getString(19));
		}
		catch (Exception e)
		{
			
		}
		sc.close();
	}

}
