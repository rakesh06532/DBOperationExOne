package CollectionDemo;
import java.util.*;

public class ArrayToList {
	public static void main(String[] args) {
		int arr[]= {1,3,6,2,8,4,5,2};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) 
		{
			al.add(arr[i]);
		}
		System.out.println(al);
	}

}
