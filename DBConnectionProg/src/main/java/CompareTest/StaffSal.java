package CompareTest;

public class StaffSal implements Comparable<Object>{
	int StaffId;
	String StaffName;
	int StaffSal;
	char StaffGender;
	String StaffAddress;
	
	public StaffSal(int Id,String Name,int Sal,char Gender,String Address) {
		this.StaffId=Id;
		this.StaffName=Name;
		this.StaffSal=Sal;
		this.StaffGender=Gender;
		this.StaffAddress=Address;
	}
	public String toString() {
		return StaffId+" "+StaffName+" "+StaffSal+" "+StaffGender+" "+StaffAddress;
	}
      public int compareTo(Object o) {
    	  StaffSal s=(StaffSal)o;
    	  
    	  //return this.StaffId-s.StaffId;
    	 return this.StaffSal-s.StaffSal;
      }
}
