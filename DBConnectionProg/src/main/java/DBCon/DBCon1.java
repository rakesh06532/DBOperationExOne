package DBCon;

import java.sql.*;
import java.util.Scanner;

public class DBCon1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps=con.prepareStatement("select * from emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}

}
