package CompareTest;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class Student2 implements Comparable,Comparator {
	String StName;
	int StId;
	String StGrade;
	char StGender;
	
	 Student2(int Id, String Name, String Grade, char Gender){
		 this.StId=Id;
		 this.StName=Name;
		 this.StGrade=Grade;
		 this.StGender=Gender;
    }
	 
	 public String toString()
	 {
		 return StId+" "+StName+" "+StGrade+" "+StGender;
	 }
	 
	 public int compareTo(Object o) {
		 
		 Student2 s=(Student2)o;
		// return this.StId-s.StId;
		 return this.StName.compareTo(s.StName);
	 }
	 
	 @Override
	 public int compare(Object o1,Object o2) {
		 return 0;
	 }

}
