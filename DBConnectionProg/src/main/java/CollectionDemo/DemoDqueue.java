package CollectionDemo;
import java.util.*;
public class DemoDqueue {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc){
			
			Deque<Integer> d=new ArrayDeque<Integer>();
			while(true) {
				System.out.println("=====Enter Choice====");
				System.out.println("1. add()\n2. remove()\n3. addFirst()"
						+ "\n4. removeFirst()\n5. addLast()\n6. removeLast()\n"
						+ "7. exit ");
				System.out.println("Enter the Choice ");
				int choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("Enter elements");
					d.add(new Integer(sc.nextInt()));
					System.out.println(d.toString());
					break;
				case 2:
					if(d.isEmpty()) {
						System.out.println("deQue is empty...");
					}
					else {
						d.remove();
						System.out.println(d.toString());
					}
					break;
				case 3:
					System.out.println("Enter element");
					d.addFirst(new Integer(sc.nextInt()));
					System.out.println(d.toString());
					break;
				case 4:
					d.removeFirst();
					System.out.println(d.toString());
					break;
				case 5:
					System.out.println("Enter element");
				    d.addLast(new Integer(sc.nextInt()));
				    System.out.println(d.toString());
					break;
				case 6:
					d.removeLast();
					System.out.println(d.toString());
					break;
				case 7:
					System.out.println("Program stoped...");
					System.exit(0);
					break;
				default: 
						System.out.println("Invalid Choice...");
				}//switch 
			}//while loop
		}//end of try with resource
	}

}
