package Test;

import java.sql.*;

public class DBCon1 {
	public static void main(String[] args) {
		
		try
		{
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from bookdetails49");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"
			+rs.getFloat(4)+"\t"+rs.getInt(5));
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
