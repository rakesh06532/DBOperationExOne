package EmpList;

public class EmpClass implements Comparable<EmpClass>{
	String EmpName;
	int EmpAge;
	double EmpSal;
	
	EmpClass(String Name,int Age,int Sal){
		this.EmpName=Name;
		this.EmpAge=Age;
		this.EmpSal=Sal;
	}
	public String toString() {
		return EmpName+" "+EmpAge+" "+EmpSal;
	}
	public String getEmpName() {
		return EmpName;
	}
	public int getEmpAge() {
		
		return EmpAge;
	}
	
	public double getEmpSal() {
		if(EmpAge>=25)
		{
			EmpSal=EmpSal+EmpSal*0.10;
		}
		return EmpSal;
		
	}
	public int compareTo(EmpClass e) {

		return this.EmpAge-e.EmpAge;
		
		
	}

}
