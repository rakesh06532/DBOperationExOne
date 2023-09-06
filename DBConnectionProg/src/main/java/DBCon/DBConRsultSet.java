package DBCon;

import java.sql.*;

public class DBConRsultSet {
	public static void main(String[] args) {
		try {
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement stm=con.createStatement
				(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		System.out.println("====CreateStatement====");
		ResultSet rs1=stm.executeQuery("select * from userreg49");
		rs1.afterLast();//Moving the cursor after last row
		
		while(rs1.previous())
		{
			System.out.println(rs1.getString(1)+"\t"
					+rs1.getString(2)+"\t"+rs1.getString(3)
					+"\t"+rs1.getString(4)+"\t"+rs1.getString(5)
					+"\t"+rs1.getLong(6)+"\t"+rs1.getString(7));
		}
		
		//rs1.deleteRow();
		System.out.println("=====Display row 4=====");
		rs1.absolute(4);
		System.out.println(rs1.getString(1)+"\t"
				+rs1.getString(2)+"\t"+rs1.getString(3)
				+"\t"+rs1.getString(4)+"\t"+rs1.getString(5)
				+"\t"+rs1.getLong(6)+"\t"+rs1.getString(7));
		
		System.out.println("=======PreparedStatement======");
		
		PreparedStatement ps=con.prepareStatement
				("select * from userreg49",1004,1007);
		ResultSet rs2=ps.executeQuery();
		rs2.afterLast();
		System.out.println("======Desplay in reverse======");
		
		while(rs2.previous())
		{
			System.out.println(rs2.getString(1)+"\t"
					+rs2.getString(2)+"\t"+rs2.getString(3)
					+"\t"+rs2.getString(4)+"\t"+rs2.getString(5)
					+"\t"+rs2.getLong(6)+"\t"+rs2.getString(7));
		}
		}catch(Exception e) {e.printStackTrace();}
	}

}
