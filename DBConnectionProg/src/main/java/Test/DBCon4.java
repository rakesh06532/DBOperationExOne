package Test;

import java.sql.*;
import java.util.*;

public class DBCon4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps1=con.prepareStatement("insert into bookdetails49 values(?,?,?,?,?)");
			PreparedStatement ps2=con.prepareStatement("select * from bookdetails49");
			PreparedStatement ps3=con.prepareStatement("select * from bookdetails49 where bcode=?");
			PreparedStatement ps4=con.prepareStatement("update bookdetails49 set bprice=? , bqty=? where bcode=?");
			PreparedStatement ps5=con.prepareStatement("delete from bookdetails49 where bcode=?");
			
			while(true)
			{
				System.out.println("=====Select choice======");
				System.out.println("            1.Add Product\n"
						+ "            2.View all product\n"
						+ "            3.View Product by code\n"
						+ "            4.Update Product code by code\n"
						+ "            5.Delete Product code by code\n"
						+ "            6.Exit");
				System.out.println("Enter the Choice");
				
				switch(Integer.parseInt(sc.nextLine()))
				{
				case 1:
					System.out.println("Enter the code");
					String bcode=sc.nextLine();
					System.out.println("Enter the bname");
					String bname=sc.nextLine();
					System.out.println("Enter the bauthor");
					String bauthor=sc.nextLine();
					System.out.println("Enter book price");
					double bprice=Double.parseDouble(sc.nextLine());
					System.out.println("Enter book quantity");
					int bqty=Integer.parseInt(sc.nextLine());
					
					ps1.setString(1, bcode);
					ps1.setString(2, bname);
					ps1.setString(3, bauthor);
					ps1.setDouble(4, bprice);
					ps1.setInt(5, bqty);
					
					int k=ps1.executeUpdate();
					if(k>0)
						System.out.println("Product inserted successfully...");
					break;
				case 2:
					ResultSet rs=ps2.executeQuery();
					while(rs.next())
					{
						System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"
					+rs.getString(3)+"\t"+rs.getDouble(4)+"\t"+rs.getInt(5));
					}
					break;
				case 3:
					System.out.println("Enter bcode");
					String bc=sc.nextLine();
					ps3.setString(1, bc);
					ResultSet rs2=ps3.executeQuery();
					if(rs2.next())
					{
						System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "
								+rs2.getDouble(4)+" "+rs2.getInt(5));
					}
					else
						System.out.println("Invalid product code");
					break;
				case 4: 
					System.out.println("Enter book code");
					String bcode2=sc.nextLine();
					ps3.setString(1, bcode2);
					ResultSet rs3=ps3.executeQuery();
					if(rs3.next())
					{
						System.out.println("Enter new book price");
						double nbprice=Double.parseDouble(sc.nextLine());
						System.out.println("Enter new qnty");
						int nqnty=Integer.parseInt(sc.nextLine());
						
						ps4.setDouble(1, nbprice);
						ps4.setInt(2, nqnty);
						ps4.setString(3, bcode2);
						
					int z=ps4.executeUpdate();
					if(z>0)
						System.out.println("Insert updated successfully...");
					}
					else
						System.out.println("Invalid product details ");
					break;
				case 5:
					System.out.println("Enter book code");
					String bcode3=sc.nextLine();
					ps3.setString(1, bcode3);
					ResultSet rs5=ps3.executeQuery();
					if(rs5.next())
					{
						ps5.setString(1, bcode3);
						int x=ps5.executeUpdate();
						if(x>0)
							System.out.println("Deleted query successfully...");
					}
					else
						System.out.println("Invalid product code");
					break;
				case 6:
					System.out.println("Program terminated");
					System.exit(0);
					break;
				}
				
			}//while loop
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("Don't Enter special character");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			sc.close();
		}
	}

}
