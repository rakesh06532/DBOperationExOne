package AnonymousInnerClass;

public class Addition implements Arithematic {
	public void calculation(int x,int y) {
		System.out.println("Addition: "+(x+y));
	}
	public static void main(String[] args) {
		new Addition().calculation(53, 23);
	}

}
