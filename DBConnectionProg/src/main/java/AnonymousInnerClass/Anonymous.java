package AnonymousInnerClass;

public class Anonymous {
	public static void main(String[] args) {
		//Anonymous Inner classes as implementation class
		Runnable ob1=new Runnable()
		{
			public void run()
			{
				try
				{
				for(int i=1;i<=5;i++)
				{
					Thread.sleep(1000);
					System.out.println("Display1 "+i);
				}
				}catch(Exception e) {e.printStackTrace();}
			}

		};
		
		//Anonymous Inner classes as implementation class
		
		Runnable ob2=new Runnable()
		{
			public void run()
			{
				try {
					
				for(int i=100;i<=105;i++)
				{
					Thread.sleep(1000);
					System.out.println("Display2 "+i);
				}
				}catch(Exception e) {e.printStackTrace();}
			}

		};
		
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		
		t1.start();
		t2.start();
	}

}
