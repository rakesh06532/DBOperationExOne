package EmpList;

import java.util.TreeSet;
public class EmpTest {
	public static void main(String[] args) {
		
		EmpClass e1=new EmpClass("Rakesh",25,20000);
		EmpClass e2=new EmpClass("Aryan",5,15000);
		EmpClass e3=new EmpClass("Prince",6,16000);
		EmpClass e4=new EmpClass("Sohani",12,17000);
		EmpClass e5=new EmpClass("Lilam",20,18000);
		EmpClass e6=new EmpClass("Chandan",26,21000);
		e1.getEmpSal();
		e2.getEmpSal();
		e3.getEmpSal();
		e4.getEmpSal();
		e5.getEmpSal();
		e6.getEmpSal();
		TreeSet<EmpClass> ts=new TreeSet<EmpClass>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		
		System.out.println(ts.toString());
	}

}
