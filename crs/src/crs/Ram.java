package crs;
class shyam
{
	void run()
	{
		System.out.println("shyam is running");
		
	}
}
public class Ram extends shyam {
	void dance()
	{
		System.out.println("Ram is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ram m=new Ram();
		m.dance();
		m.run();

	}

}
