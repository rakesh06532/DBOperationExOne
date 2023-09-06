package CollectionDemo;

import java.util.*;

public class CursorDemo {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(new Integer(11));
		v.add(new Integer(12));
		v.add(new Integer(25));
		v.add(new Integer(20));
		v.add(new Integer(23));
		v.add(new Integer(63));
		
		System.out.println("===Iterator====");
		Iterator<Integer> it=v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n===Iterator java8====");
		Iterator<Integer> it2=v.iterator();
		it2.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});
		System.out.println("\n====ListIterator====");
		ListIterator<Integer> li=v.listIterator();
		System.out.println("Forward: ");
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println("\nBackward: ");
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		System.out.println("\n=====Enumeration=====");
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+" ");
		}
		System.out.println("\n====spliterater======");
		Spliterator<Integer> spl=v.spliterator();
		spl.forEachRemaining((z)-> {
			System.out.print(z.toString()+" ");
		});
		System.out.println("\n====forEach()=====");
		v.forEach((f)-> {
			System.out.print(f.toString()+" ");
		});
	}

}
