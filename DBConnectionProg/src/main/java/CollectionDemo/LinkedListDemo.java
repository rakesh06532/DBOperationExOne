package CollectionDemo;
import java.util.*;
public class LinkedListDemo implements Comparable<Object>{
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
//		l.add(10);
//		l.add(20);
//		l.add(25);
//		l.add(12);
//		l.add(11);
//		l.add(50);
		l.add("Rakesh");
		l.add("Aryan");
		l.add("Ramesh");
		l.add("Prince");
		l.add("Sohani");
		l.add("Lilam");
		
		System.out.println(l.toString());
		//Collections.sort(l);
		System.out.println(l.toString());
		System.out.println("======forEach======");
		l.forEach((k)->{
			System.out.println(k); //Lambda Expression 
		});
		System.out.println("=====Iterator======");
		Iterator<String> i=l.iterator();
		i.forEachRemaining((k)->{
			System.out.println(k);
		});
		System.out.println("=====Spliterator======");
		Spliterator<String> spl=l.spliterator();
		spl.forEachRemaining((k)->{
			System.out.println(k);
		});
		System.out.println("=====ListIterator=====");
		ListIterator<String>li=l.listIterator();
		li.forEachRemaining((k)->{
			System.out.println(k);
		});
		
		System.out.println("=====After sorting ListIterator=====");
		Collections.sort(l);
		ListIterator<String>li2=l.listIterator();
		li2.forEachRemaining((k)->{
			System.out.println(k);
		});
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

}
