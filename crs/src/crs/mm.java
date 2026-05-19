package crs;
// step 1 extends the thread class

public class mm {
	
	public class Tg extends Thread{
		//step 2 override the run method
		
		public void run()
		{
			System.out.println("Thread is running");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tg t1=new Tg ();
		
		Tg t2=new Tg();
		
		t1.setPriority(9);
		t1.start();
		t2.start();
		
		System.out.println(t1.getPriority());
		
		System.out.println(t2.getPriority());

	}

}
