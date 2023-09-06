package DBCon;

import java.util.Scanner;
import javax.sql.rowset.*;

public class DBConRowSetFactory {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			RowSetFactory rsf=RowSetProvider.newFactory();
			System.out.println("=====Choice======");
			System.out.println("1. jdbc RowSet\n2. CachedRowset");
			int n=sc.nextInt();
			
			switch(n)
			{
			case 1:
				JdbcRowSet jrs=rsf.createJdbcRowSet();
				jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
				jrs.setUsername("system");
				jrs.setPassword("root");
				jrs.setCommand("select * from userreg49");
				jrs.execute();
				System.out.println("======User Details======");
				while(jrs.next())
				{
					System.out.println(jrs.getString(1)+"\t"+jrs.getString(2)+"\t"
							+jrs.getString(3)+"\t"+jrs.getString(4)+"\t"+jrs.getString(5)+"\t"
							+jrs.getLong(6)+"\t"+jrs.getString(7)+"\t");
				}
				break;
			case 2:
				CachedRowSet crs=rsf.createCachedRowSet();
				crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
				crs.setUsername("system");
				crs.setPassword("root");
				crs.setCommand("select * from userreg49");
				crs.execute();
				System.out.println("=======User details========");
				while(crs.next())
				{
					System.out.println(crs.getString(1)+"\t"+crs.getString(2)+"\t"
							+crs.getString(3)+"\t"+crs.getString(4)+"\t"+crs.getString(5)+"\t"
							+crs.getLong(6)+"\t"+crs.getString(7)+"\t");
				}
				break;
			default :
				System.out.println("Invalid Choice");
			}
			sc.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
