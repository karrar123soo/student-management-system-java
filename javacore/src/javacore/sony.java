package javacore;
class Ronty
{
	void walk()
	{
		System.out.println("Ronty is walking");
	}
}
class Dony extends Ronty
{
	void run ()
	{
		System.out.println("Dony is running");
	}
}

public class sony extends Dony {
	void dance()
	{
		System.out.println("sony is dancing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sony s=new sony();
		s.dance();
		s.run();
		s.walk();
		

	}

}
