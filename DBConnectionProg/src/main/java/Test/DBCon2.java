package Test;

import java.sql.*;

public class DBCon2 {
	public static void main(String[] args) {
		
	try
	{
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from employee49");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+
			"\t"+rs.getString(5)+"\t"+rs.getLong(6));
		}
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}

}
