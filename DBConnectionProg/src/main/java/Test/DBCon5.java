package Test;

import java.sql.*;
import java.util.Scanner;

public class DBCon5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps1=con.prepareStatement("insert into empdetails49 values(?,?,?,?,?)");
			PreparedStatement ps2=con.prepareStatement("select * from empdetails49");
			PreparedStatement ps3=con.prepareStatement("select * from empdetails49 where eid=?");
			PreparedStatement ps4=con.prepareStatement("update empdetails49 set bsal=? where eid=?");
			PreparedStatement ps5=con.prepareStatement("delete from empdetails49 where eid=?");
			
			while(true)
			{
			System.out.println("========Select Choice========");
			System.out.println("1.Add Employee\n2.View Employee details\n3.View Employee by Id"
					+ "\n4.Update Employee by Id\n5.Delete Employee by Id"
					+ "\n6.Exit\n==============================");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println("Enter employee Id");
				String eid=sc.nextLine();
				System.out.println("Enter employee name");
				String ename=sc.nextLine();
				System.out.println("Enter employee designation ");
				String edesg=sc.nextLine();
				System.out.println("Enter Employee basic salary");
				float bsal=Float.parseFloat(sc.nextLine());
				float tsal=bsal+bsal*0.93f+bsal*0.61f;
				
				ps1.setString(1, eid);
				ps1.setString(2, ename);
				ps1.setString(3, edesg);
				ps1.setFloat(4, bsal);
				ps1.setFloat(5, tsal);
				
				int k=ps1.executeUpdate();
				if(k>0)
					System.out.println("Employee updated successfully...");
				
				break;
			case 2:
				ResultSet rs2=ps2.executeQuery();
				while(rs2.next())
				{
					System.out.println(rs2.getString(1)+"\t"+rs2.getString(2)+"\t"+rs2.getString(3)
					+"\t"+rs2.getFloat(4)+"\t"+rs2.getFloat(5));
				}
				
				break;
			case 3:
				System.out.println("Enter employee Id");
				String eid2=sc.nextLine();
				ps3.setString(1, eid2);
				ResultSet rs3=ps3.executeQuery();
				if(rs3.next())
				{
					System.out.println(rs3.getString(1)+"\t"+rs3.getString(2)+"\t"+rs3.getString(3)
					+"\t"+rs3.getFloat(4)+"\t"+rs3.getFloat(5));
				}
				else
					System.out.println("Invalid Employee Id");
				break;
			case 4:
				System.out.println("Enter Employee Id");
				String eid3=sc.nextLine();
				ps3.setString(1, eid3);
				ResultSet rs4=ps3.executeQuery();
				if(rs4.next())
				{
					System.out.println("Enter basic sal");
					float bsal2=Float.parseFloat(sc.nextLine());
					ps4.setFloat(1, bsal2);
					ps4.setString(2, eid3);
					
					int y=ps4.executeUpdate();
					if(y>0)
						System.out.println("Employee updated successfully...");
				}
				else
					System.out.println("Invalid Employee details");
				break;
			case 5:
				System.out.println("Enter employee Id");
				String eid4=sc.nextLine();
				ps3.setString(1, eid4);
				ResultSet rs5=ps3.executeQuery();
				if(rs5.next())
				{
					ps5.setString(1, eid4);
					int z=ps5.executeUpdate();
					if(z>0)
						System.out.println("Employee deleted successfully...");
				}
				else
					System.out.println("Invalid Employee Id");
				break;
			case 6:
				System.out.println("Program terminated");
				System.exit(0);
				
			}
			}//while loop close
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		sc.close();
	}

}
