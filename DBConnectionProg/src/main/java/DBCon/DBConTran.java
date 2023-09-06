package DBCon;

import java.sql.*;
import java.util.*;

public class DBConTran {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			System.out.println("Commit status: "+con.getAutoCommit());
			con.setAutoCommit(false);
			System.out.println("Commit status: "+con.getAutoCommit());
			Savepoint sp=con.setSavepoint();
			PreparedStatement ps1=con.prepareStatement
					("select * from transLog49 where datetime=?");
			PreparedStatement ps2=con.prepareStatement
					("update transLog49 set amt=amt+? where datetime=?");
			System.out.println("Enter Transaction date");
			String date=sc.nextLine();
			ps1.setString(1, date);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next())
			{
				int bal=rs1.getInt(2);
				System.out.println("Enter Benficiery Transaction date");
				String tdate=sc.nextLine();
				ps1.setString(1, tdate);
				ResultSet rs2=ps1.executeQuery();
				if(rs2.next())
				{
					System.out.println("Enter transaction amount");
					int amt=sc.nextInt();
					if(bal>=amt)
					{
						ps2.setInt(1, -amt);
						ps2.setString(2, date);
						int k=ps2.executeUpdate();
						
						ps2.setInt(1, amt);
						ps2.setString(2, tdate);
						int j=ps2.executeUpdate();
						
						if(k==1 && j==1)
						{
							con.commit();
							System.out.println("Transaction successfull...");
						}
						else
						{
							System.out.println("Transaction fail...");
							con.rollback(sp);
						}
					}
					else
						System.out.println("Insufficient balance");
						
				}
				else 
					System.out.println("Invalid transaction date");
			}
			else 
				System.out.println("Invalid account no");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}

}
