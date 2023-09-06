package DBCon;

import java.util.*;
import java.sql.*;
import java.io.*;

public class DBConBinaryFile2 {
	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps=con.prepareStatement
					("select * from binary49 where id=?");
			System.out.println("Enter id: ");
			String id=sc.nextLine();
			System.out.println("Enter Destination file name: ");
			File f=new File(sc.nextLine());
			FileOutputStream fos=new FileOutputStream(f);
			ps.setString(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Blob b=rs.getBlob(2);
				byte by[]=b.getBytes(1,(int) b.length());
				fos.write(by);
				System.out.println("File Retrieved successfully...");
			}
			else System.out.println("Invalid Id...");
			fos.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
