package pack1;

import java.util.*;

class EmpDetails{
	int empsal;
	String empName;
	String empdept;
	public EmpDetails(int empsal,String empName,String empdept) {
		this.empsal=empsal;
		this.empName=empName;
		this.empdept=empdept;
	}
public String toString()
{
	return empName+empsal+empdept;
}
}
public class Test {

	public void meth1()
	{
		ArrayList<EmpDetails> al=new ArrayList<EmpDetails>();
		EmpDetails obj1=new EmpDetails(20000," Rakesh "," Java");
		EmpDetails obj2=new EmpDetails(18000," Aryan "," Java");
		EmpDetails obj3=new EmpDetails(15000," Sohani "," java");
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		
		Iterator<EmpDetails> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		new Test().meth1();
	}
}

