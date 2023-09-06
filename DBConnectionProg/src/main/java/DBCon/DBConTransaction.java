package DBCon;

import java.sql.*;
import java.util.*;

public class DBConTransaction {
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			System.out.println("Commit status: "+con.getAutoCommit());
			con.setAutoCommit(false);
			System.out.println("Commit status: "+con.getAutoCommit());
			Savepoint sp=con.setSavepoint();
			PreparedStatement ps1=con.prepareStatement("select * from bank49 where accno=?");
			PreparedStatement ps2=con.prepareStatement
					("update bank49 set balance=balance+? where accno=?");
			System.out.println("Enter customer account no: ");
			long hAccno=sc.nextLong();
			ps1.setLong(1, hAccno);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next())
			{
				float balance=rs1.getFloat(3);
				System.out.println("Enter benificiery account no");
				long bAccNo=sc.nextLong();
				ps1.setLong(1, bAccNo);
				ResultSet rs2=ps1.executeQuery();
				if(rs2.next())
				{
					System.out.println("Enter Transaction amount");
					int amount=sc.nextInt();
					if(balance>=amount)
					{
						ps2.setInt(1, -amount);
						ps2.setLong(2, hAccno);
						int k=ps2.executeUpdate();
						
						ps2.setInt(1, amount);
						ps2.setLong(2, bAccNo);
						int j=ps2.executeUpdate();
						if(k==1 && j==1)
						{
							System.out.println("Transaction Successfull...");
							con.commit();
						}//end if
						else
						{
							System.out.println("Transaction failed");
							con.rollback(sp);
						}
					}//end if
					else
					{
						System.out.println("Insufficient Balance");
					}
				}//end if
				else
				{
					System.out.println("Invalid Benificiery account no");
				}
				
			}//if end
			else
			{
				System.out.println("Invalid account no");
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
