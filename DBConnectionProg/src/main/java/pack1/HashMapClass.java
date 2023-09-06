package pack1;

import java.util.*;

public class HashMapClass {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter key value");
			Integer kvalue=Integer.parseInt(sc.nextLine());
			System.out.println("Enter String Value");
			String Svaue=sc.nextLine();
			hm.put(kvalue, Svaue);
			
		}
		
		System.out.println("Retrieve Integer values");
		System.out.println(hm.keySet().toString());
		
		System.out.println("Retrieve String values");
		System.out.println(hm.values().toString());
		
		System.out.println("Retrieve the data from HashMap");
		hm.forEach((p,q)-> {
			System.out.println(p+" "+q);
		});
		sc.close();
	}

}
