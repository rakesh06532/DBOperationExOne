package AnonymousInnerClass;

public class Subtraction implements Arithematic {
	public void calculation(int x,int y) {
		System.out.println("Subtraction: "+(x-y));
	}
public static void main(String[] args) {
	new Subtraction().calculation(25, 23);
}
}
