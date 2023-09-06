package DBCon;

import java.sql.*;
import java.util.*;

public class DBCon5 {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);)
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			
			while(true)
			{
			System.out.println("=======Choose Option========");
			System.out.println("1. UserRegistration\n2. User Login\n3. Exit");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			case 1: 
				PreparedStatement ps=con.prepareStatement
				("insert into userreg49 values(?,?,?,?,?,?,?)");
				
				System.out.println("Enter user name");
				String uname=sc.nextLine();
				System.out.println("Enter passwor ");
				String pword=sc.nextLine();
				System.out.println("Enter first name");
				String fname=sc.nextLine();
				System.out.println("Enter last name");
				String lname=sc.nextLine();
				System.out.println("Enter mail id");
				String mailid=sc.nextLine();
				System.out.println("Enter phone no");
				long phno=Long.parseLong(sc.nextLine());
				System.out.println("Enter address ");
				String addr=sc.nextLine();
				
				ps.setString(1, uname);
				ps.setString(2, pword);
				ps.setString(3, fname);
				ps.setString(4, lname);
				ps.setString(5, mailid);
				ps.setLong(6, phno);
				ps.setString(7, addr);
				
				int k=ps.executeUpdate();
				if(k>0) System.out.println("Record Inserted successfully...\n");
			    break;
			
			case 2:
				PreparedStatement ps2=con.prepareStatement
				("select * from userreg49 where uname=? and pword=?");
				
				System.out.println("Enter user name");
				String un=sc.nextLine();
				System.out.println("Enter password");
				String up=sc.nextLine();
				
				ps2.setString(1, un);
				ps2.setString(2, up);
				
				ResultSet rs=ps2.executeQuery();
				if(rs.next())
				{
					System.out.println("Login successfull...\n");
					System.out.println("1. View all user details\n2. View single user details");
					
					int n=Integer.parseInt(sc.nextLine());
					switch(n)
					{
					case 1:
					PreparedStatement ps3=con.prepareStatement
							("Select * from userreg49");
					ResultSet rs2=ps3.executeQuery();
					while(rs2.next())
					{
						System.out.println(rs2.getString(1)+"\t"
								+rs2.getString(2)+"\t"+rs2.getString(3)
								+"\t"+rs2.getString(4)+"\t"+rs2.getString(5)
								+"\t"+rs.getLong(6)+"\t"+rs2.getString(7));
					}
					System.out.println();
					break;
					case 2:
						PreparedStatement ps4=con.prepareStatement
						("Select * from userreg49 where uname=?"); 
				        System.out.println("Enter user name");
				        String un2=sc.nextLine();
				        
				        ps4.setString(1, un2);
				        ResultSet rs3=ps4.executeQuery();
						if(rs3.next())
						{
							System.out.println(rs3.getString(1)+"\t"
									+rs3.getString(2)+"\t"+rs3.getString(3)
									+"\t"+rs3.getString(4)+"\t"+rs3.getString(5)
									+"\t"+rs.getLong(6)+"\t"+rs3.getString(7));
							System.out.println();
						}//close if
						else System.out.println("Invalid user\n");
						break;
					}//end switch
				}//close if
				else
					System.out.println("Enter valid user name\n");
				break;
				
				default :
					System.out.println("Program terminated");
					System.exit(0);
			}//while loop
			}//while loop
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
