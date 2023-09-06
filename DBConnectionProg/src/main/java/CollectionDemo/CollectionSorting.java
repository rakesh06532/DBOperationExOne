package CollectionDemo;

import java.util.*;

public class CollectionSorting {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc){
			try {
				ArrayList<Integer> al=new ArrayList<Integer>();
				System.out.println("Enter number of element");
				Integer n=sc.nextInt();
				System.out.println("Enter "+n+" elements");
				for(int i=0;i<n;i++) {
					al.add(new Integer(sc.nextInt()));
				}
				System.out.println("===Before Sorting====");
				al.forEach((k)-> {  //lambda expression
					System.out.print(k+" ");
				});
				
				System.out.println("\n=======After Sorting=======");
				Collections.sort(al);//sorting process
				
				al.forEach((k)->{   //lambda expression
					System.out.print(k+" ");
				});
				
				System.out.println("\n====Descending order=====");
				for(int i=al.size()-1;i>=0;i--) {
					System.out.print(al.get(i)+" ");
				}
				
			}catch(Exception e) { e.printStackTrace();}
			
		}//end of try
	}

}
