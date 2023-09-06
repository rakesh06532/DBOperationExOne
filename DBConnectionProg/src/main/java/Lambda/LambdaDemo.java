package Lambda;

public class LambdaDemo {
	public static void main(String[] args) {
		//Lambda Expression
		Arithematic am= (int x,int y) ->
			{
				System.out.println("Addition: "+(x+y));
			};
		//Lambda Expression
		Arithematic a= (int x,int y) ->
			{
				System.out.println("Subtraction: "+(x-y));
			};
			
		am.calculation(25, 25);
		a.calculation(25, 25);
	}

}
