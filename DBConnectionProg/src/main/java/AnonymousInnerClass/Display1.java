package AnonymousInnerClass;

public class Display1 implements Runnable {
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

}
