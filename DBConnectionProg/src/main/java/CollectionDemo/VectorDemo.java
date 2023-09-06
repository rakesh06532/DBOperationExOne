package CollectionDemo;

import java.util.Vector;
import java.util.HashSet;

public class VectorDemo {
	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		
		hs.add(54);
		hs.add(22);
		hs.add(45);
		hs.add(33);
		hs.add(11);
		hs.add(null);
		hs.add(null);
		System.out.println(hs.toString());
		Vector<Object> v=new Vector<Object>();
		v.add(10);
		v.add(12);
		v.add(25);
		v.add(52);
		v.add(32);
		v.add(36);
		v.add(null);
		v.add(null);
		v.add(null);
		
		System.out.println(v.get(0));
		System.out.println(v.toString());
	}

}
