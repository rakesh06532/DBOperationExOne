package pack1;

public class InterfaceLambda {
	public static void main(String[] args) {
		//LambdaExpression
		InterfaceDemo IF= (int x,int y) ->
			{
				System.out.println("===addition() method===");
				System.out.println("Addition : "+(x+y));
			};
		IF.addition(12, 25);
	}

}
