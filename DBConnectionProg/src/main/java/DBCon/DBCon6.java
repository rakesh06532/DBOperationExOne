package DBCon;

import java.sql.*;
//import javax.sql.*;
import javax.sql.rowset.*;

public class DBCon6 {
	public static void main(String[] args) {
		try
		{
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			DatabaseMetaData dmd=con.getMetaData();
			System.out.println("DriverName: "+dmd.getDriverName());
			System.out.println("DriverVersion: "+dmd.getDriverVersion());
			
			PreparedStatement ps=con.prepareStatement
					("insert into empdata49 values(?,?,?,?)");
			
			ParameterMetaData pmd=ps.getParameterMetaData();
			System.out.println("Count: "+pmd.getParameterCount());
			
			PreparedStatement ps2=con.prepareStatement("Select * from empdata49");
			ResultSet rs=ps2.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("Name: "+rsmd.getColumnClassName(1));
			System.out.println("Count: "+rsmd.getColumnCount());
			
			RowSetFactory rsf=RowSetProvider.newFactory();
			JdbcRowSet jrs=rsf.createJdbcRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			jrs.setUsername("system");
			jrs.setPassword("root");
			jrs.setCommand("select * from empdata49");
			jrs.execute();
			//RowSetMetaData rsm=(RowSetMetaData)jrs.getMetaData();
			//System.out.println(rsm.getColumnCount());
		}catch(Exception e) {e.printStackTrace();}
	}

}
