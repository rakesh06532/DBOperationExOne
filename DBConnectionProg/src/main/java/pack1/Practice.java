package pack1;
import java.util.*;
import java.util.stream.*;
public class Practice {
	public static void RemoveDuplicate() {
		Integer arr[]= {1,8,3,5,1,3,20};
		
		TreeSet<Integer> t=new TreeSet<Integer>(Arrays.asList(arr));
		System.out.println(t.toString());
		
	}
	public static void arrayToArrayList() {
		int arr[]= {1,8,3,5,1,3,20};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(Integer x:arr) {
			al.add(x);
		}
		System.out.println(al.toString());
	}
	public static void arraylistToArray() {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(12);
		al.add(20);
		al.add(25);
		Object o[]=al.stream().toArray();
		for(Object ob:o) {
			System.out.println(ob);
		}
	}
	public static void main(String[] args) {
		//RemoveDuplicate();
		//arrayToArrayList();
		arraylistToArray();
	}

}
