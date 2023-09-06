package CollectionDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of element");
			Integer n=sc.nextInt();
			Integer a[]=new Integer[n];
			System.out.println("Enter "+n+" Elemtns ");
			
			for(int i=0;i<a.length;i++) {
				a[i]=new Integer(sc.nextInt());
			}
			System.out.println("Before sorting: ");
			for(Integer i:a)
			{
				System.out.print(i+" ");
			}
			System.out.println("\nAfter soring Ascending oreder");
			Arrays.sort(a);
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			
			System.out.println("\nDescending Order");
			
			for(int i=a.length-1;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
			sc.close();
		}catch(Exception e) { e.printStackTrace(); }
	}

}
