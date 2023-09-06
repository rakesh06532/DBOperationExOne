package CompareTest;


@SuppressWarnings("rawtypes")
public class EmpDetails implements Comparable {
	int EmpId;
	String EmpName;
	String EmpGender;
	int EmpSal;
	
	EmpDetails(int Id,String Name,String Gender,int Sal){
		this.EmpId=Id;
		this.EmpGender=Gender;
		this.EmpName=Name;
		this.EmpSal=Sal;
	}
	public String toString() {
		return EmpId+" "+EmpName+" "+EmpGender+" "+EmpSal;
	}
//	@Override
//	public int compare(Object o1, Object o2) {
//       
//		EmpDetails e1=(EmpDetails)o1;
//		EmpDetails e2=(EmpDetails)o2;
//		return e2.EmpSal-e1.EmpSal;
//		}
		
	@Override
	public int compareTo(Object o) {
		
		EmpDetails e1=(EmpDetails)o;
		System.out.println(e1.EmpSal);
		
		return e1.EmpSal-this.EmpSal;//Descending Order
		//return this.EmpSal-e1.EmpSal;//Ascending Order
	
	}
}
	
