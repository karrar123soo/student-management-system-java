package crs;


public class Akashays implements Runnable {
	@Override
	public void run() {
		//TODO AUTO-generated method stub
		System.out.println("thread is running");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Akashays s=new Akashays();
		//Thread t1=new Thread(s);
		//t1.start();
		
		try
		{
			for (int i=1;i<=10;i++)
			{
				System.out.println("thread is running"+1);
				Thread.sleep(5000);
			}
		}
		catch (Exception e)
		{
			
		}
		
	}
}


		
	


