package pack1;

import java.util.*;
public class LinkedHashMapClass {
	public static void main(String[] args) {
		try {
		LinkedHashMap<Integer,String> lm=new LinkedHashMap<Integer,String>();
		
		lm.put(1, "Rakesh");
		lm.put(2, "Aryan");
		lm.put(3, "Prince");
		lm.put(4, "Sohani");
		lm.put(5, "Rave");
		
		System.out.println("LinkedHashMap key values");
		System.out.println(lm.keySet().toString());
		
		System.out.println("LinkedHashMap String Values");
		System.out.println(lm.values().toString());
		
		System.out.println("LinkedHashMap Entry Values");
		System.out.println(lm.entrySet().toString());
		
		System.out.println("LinkedHashMap Lambda Expression");
		lm.forEach((p,q)-> {
			System.out.println(p+" "+q);
		});
		
		}catch(Exception e) {e.printStackTrace();}
	}

}
