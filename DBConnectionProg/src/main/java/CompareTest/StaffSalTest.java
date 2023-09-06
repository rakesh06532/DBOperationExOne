package CompareTest;

import java.util.TreeSet;

public class StaffSalTest {
	public static void main(String[] args) {
		try {
			TreeSet<StaffSal> t=new TreeSet<StaffSal>(); 
			t.add(new StaffSal(6666,"Rakesh",17500,'M',"Giridih"));
			t.add(new StaffSal(2222,"Aryan",18000,'M',"Ranchi"));
			t.add(new StaffSal(3333,"Prince",17000,'M',"Giridih"));
			t.add(new StaffSal(4444,"Sohani",25000,'F',"Sono"));
			t.add(new StaffSal(5555,"Lilam",15000,'F',"Chaukitand"));
			t.add(new StaffSal(2222,"Chandan",20000,'M',"UP"));
			
			System.out.println(t.toString());
		}catch(Exception e) {e.printStackTrace();}
	}

}
