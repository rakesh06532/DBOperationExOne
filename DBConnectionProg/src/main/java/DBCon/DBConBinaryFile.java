package DBCon;

import java.sql.*;
import java.util.*;
import java.io.*;

public class DBConBinaryFile {
	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement ps=con.prepareStatement("insert into binary49 values(?,?)");
			System.out.println("Enter Id: ");
			String id=sc.nextLine();
			System.out.println("Enter file pathe: ");
			File f=new File(sc.nextLine());
			if(f.exists())
			{
				FileInputStream fis=new FileInputStream(f);
				ps.setString(1, id);
				ps.setBinaryStream(2, fis,f.length());
				int k=ps.executeUpdate();
				if(k>0)
					System.out.println("Data stored successfully...");
				
			}
			else System.out.println("Invalid file path...");
		}catch(Exception e) {e.printStackTrace();}
	}

}
