package CompareTest;

import java.util.*;

public class Student2Test {
	public static void main(String[] args) {
		TreeSet<Student2> ts=new TreeSet<Student2>();
		
		ts.add(new Student2(1,"Rakesh","AGrade",'M'));
		ts.add(new Student2(2,"Prince","AGrade",'M'));
		ts.add(new Student2(3,"Aryan","BGrade",'M'));
		ts.add(new Student2(5,"Sohani","AGrade",'F'));
		ts.add(new Student2(2,"Lilam","BGrade",'F'));
		
		System.out.println(ts.toString());
	}

}
