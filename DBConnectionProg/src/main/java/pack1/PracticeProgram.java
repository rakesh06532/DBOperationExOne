package pack1;

public class PracticeProgram {
	public static void fibonacci()
	{
		
		int f1=0,f2=1,f3;
		System.out.print(f1+" "+f2+" ");
		for(int i=1;i<=10;i++)
		{
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
	}
	public static void prime()
	{
		int a=20,flag=0;
		for(int i=3;i<a;i++)
		{
			if(a%i==0)
			{	flag=1;
			break;}
		}
		if(flag==1)
			System.out.println("Not Prime number");
		else System.out.println(" Prime number");
	}
	public static void listPrime()
	{
		int a=20,c;
		for(int i=1;i<=a;i++)
		{
			c=0;
			for(int j=1;j<=a;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.print(i+" ");
		}
	}
	public static void fibonaccis() {
		int f1=0,f2=1,f3;
		System.out.print(f1+" ");
		for(int i=1;i<=10;i++) {
			f3=f1+f2;
		System.out.print(f2+" ");
		f1=f2;
		f2=f3;
		}
	}
	public static void main(String[] args) {
		//fibonacci();
		//prime();
		//listPrime();
//		if(System.out.printf("Hi java").equals(null)) {
//			
//		}
//		if(System.out.printf("Hi java")==null) {}
		//String st="Java";
		//st.concat("java");
		fibonaccis();
	}

}
