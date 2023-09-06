package CompareTest;

import java.util.*;
public class EmpTest {
	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet<EmpDetails> al=new TreeSet<EmpDetails>();
		
		al.add(new EmpDetails(1111,"Rakesh","M",19000));
		al.add(new EmpDetails(1212,"Chandan","M",16000));
		al.add(new EmpDetails(1412,"Ravi","M",17000));
		al.add(new EmpDetails(1234,"Rahul","M",18000));
		al.add(new EmpDetails(5212,"Jyoti","F",20000));
		
	//Collections.sort(al);
	System.out.println(al);
	}

}
