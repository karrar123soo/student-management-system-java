package crs;

public class Karrars  implements Runnable{
	@Override
	public void run() {
		//TODO Auto-generated method stub
		
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Karrars s=new Karrars();
		Thread t1=new Thread(s);
		t1.start();
		
		t1.setDaemon(true);
		t1.start();
		
		System.out.println(t1.isDaemon());

	}

}
