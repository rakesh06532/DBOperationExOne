package Test;

import java.sql.*;
import java.util.Scanner;

public class DBCFunction1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			System.out.println("Enter Employee Id");
			String eid=sc.nextLine();
			
			CallableStatement cs=con.prepareCall("{call ?:=RetrieveSalary49(?)}");
			
			cs.registerOutParameter(1, Types.FLOAT); 
			cs.setString(2, eid);
			
			cs.execute();
			System.out.println("Total Salary: "+cs.getFloat(1));
		}
		catch (Exception e)
		{
			
		}
		sc.close();
	}

}
