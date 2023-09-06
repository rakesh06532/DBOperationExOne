package CollectionDemo;

import java.util.*;
public class MapClass {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			Map<String,String> m=null;
			
			System.out.println("1.HashMap\n2.Hashtable\n3.LinkedHashMap\n4.TreeMap");
			System.out.println("========Enter Choice=======");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
			      m=new HashMap<String,String>();
			      break;
			case 2:
				m=new Hashtable<String,String>();
				break;
			case 3:
				m=new LinkedHashMap<String,String>();
				break;
			case 4:
				m=new TreeMap<String,String>();
			}//close switch case
			
			System.out.println("Enter number of elements");
			int n=Integer.parseInt(sc.nextLine());
			
			for(int i=1;i<=n;i++) {
				System.out.println("Enter book code: ");
				String bCode=sc.nextLine();
				System.out.println("Enter book name:");
				String bName=sc.nextLine();
				m.put(bCode, bName);//Adding to map
			}
			System.out.println("=======Book Details=====");
			m.forEach((p,q)->{
				System.out.println(p+" "+q);
			});
			sc.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
