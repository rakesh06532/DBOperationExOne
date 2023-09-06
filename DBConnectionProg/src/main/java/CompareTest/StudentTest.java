package CompareTest;

import java.util.*;
public class StudentTest {
	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet<Student>();

		ts.add(new Student(5,"Rakesh",'M',"BGrade"));
		ts.add(new Student(2,"Aryan",'M',"AGrade"));
		ts.add(new Student(3,"Prince",'M',"BGrade"));
		ts.add(new Student(4,"Sohani",'F',"AGrade"));
	    ts.add(new Student(1,"Lilam",'F',"BGrade"));
	    ts.add(new Student(6,"Rakesh",'M',"AGrade"));
		
		System.out.println(ts.toString());
	}

}
