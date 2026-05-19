package javacore2;
 class Sawan
{
	 String color="red";
	void run()
	{
		System.out.println("Sawan is running");
	}
}

public class Ravan extends Sawan{
	String color="white";
	void run()
	{
		System.out.println("Ravan is running");
	}
	void display()
	{
		super.run();
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ravan m= new Ravan();
		m.display();

	}

}
