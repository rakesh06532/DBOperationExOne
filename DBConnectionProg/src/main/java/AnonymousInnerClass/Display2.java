package AnonymousInnerClass;

public class Display2 implements Runnable{
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
	

}
