package AnonymousInnerClass;

public class AnonymousDemo {
	public static void main(String[] args) {
		//Anonymous inner class
		Arithematic am=new Arithematic() {
			public void calculation(int x,int y) {
				System.out.println("Addition: "+(x+y));
			}
		};
		//Anonymous inner class
		Arithematic a=new Arithematic() {
			public void calculation(int x,int y) {
				System.out.println("Subtraction: "+(x-y));
			}
		};
		am.calculation(25, 25);
		a.calculation(25, 25);
	}

}
