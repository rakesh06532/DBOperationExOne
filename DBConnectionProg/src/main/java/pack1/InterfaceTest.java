package pack1;

public class InterfaceTest {
	public static void main(String[] args) {
		//Anonymous inner class 
		InterfaceDemo IF=new InterfaceDemo() {
			public void addition(int x,int y) {
				System.out.println("====addition() method====="+x);
				System.out.println("Addition: "+(x+y));
			}
		};
		IF.addition(12, 25);
		
	}

}
