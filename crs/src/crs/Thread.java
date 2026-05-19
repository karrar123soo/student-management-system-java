package crs;

//step 1 extends the thread class

public class Tg extends Thread {
	
//step 2 override the run method
	
public void run()

{
  System.out.println("Thread is running");
}

public static void main(String[] args) {
  // TODO Auto-generated method stub
  Tg t1=new Tg();
t1.star();

System.out.println(t1.getpriority());
System.out.println(t2.getpriority());
}

}



