package CollectionDemo;
import java.util.*;

public class DemoQueue {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try (sc){
			Queue<Integer> q=new PriorityQueue<Integer>();
			
			while(true) {
				System.out.println("====Choice====");
				System.out.println("1. Add Elements\n2. Remove Elements\n3. Exit");
				System.out.println("Enter Option");
				int choice=sc.nextInt();
				switch(choice) 
				{
				case 1:
					System.out.println("Enter element");
					q.add(new Integer(sc.nextInt()));
					System.out.println(q.toString());
					break;
				case 2:
					if(q.isEmpty()) {
						System.out.println("Queue is empty...");
					}
					else {
						q.remove();
						System.out.println(q.toString());
					}
					break;
				case 3:
					System.out.println("Program Stoped...");
					System.exit(0);
					break;
				default : 
						System.out.println("Invalid Input");
				}
			}
		}catch(Exception e) {e.printStackTrace();}
	}

}
