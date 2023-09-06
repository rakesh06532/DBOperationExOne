package Test;

import java.sql.*;
import java.util.Scanner;

public class DBCProcedure2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			System.out.println("Enter Employee Id");
			String eid=sc.nextLine();
			
			CallableStatement cs=con.prepareCall
					("{call EmpRetrieve49(?,?,?,?,?,?,?,?,?,?,?,?)}");
			
			cs.setString(1, eid);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.registerOutParameter(4, Types.VARCHAR);
			cs.registerOutParameter(5, Types.VARCHAR);
			cs.registerOutParameter(6, Types.VARCHAR);
			cs.registerOutParameter(7, Types.VARCHAR);
			cs.registerOutParameter(8, Types.VARCHAR);
			cs.registerOutParameter(9, Types.VARCHAR);
			cs.registerOutParameter(10, Types.BIGINT);
			cs.registerOutParameter(11, Types.FLOAT);
			cs.registerOutParameter(12, Types.FLOAT);
			
			cs.execute();
			
			System.out.println("Id: "+eid);
			System.out.println("Name: "+cs.getString(2));
			System.out.println("Designation: "+cs.getString(3));
			System.out.println("Hno: "+cs.getString(4));
			System.out.println("Street Name: "+cs.getString(5));
			System.out.println("City: "+cs.getString(6));
			System.out.println("State: "+cs.getString(7));
			System.out.println("Pin Code: "+cs.getInt(8));
			System.out.println("Mail Id: "+cs.getString(9));
			System.out.println("Phone no: "+cs.getLong(10));
			System.out.println("Basic salary: "+cs.getFloat(11));
			System.out.println("Total Salary: "+cs.getFloat(12));
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}

}
