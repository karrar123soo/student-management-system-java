package mm;
class Addition
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
class subtraction extends Addition
{
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	
}
class multiplication extends subtraction
{
	void mul(int a,int b)
	{
		System.out.println(a*b);
	}
}
class Division extends multiplication
{
	void div(int a, int b)
	{
		System.out.println(a%b);
	}
}
public class cc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division s=new Division();
		s.add(55, 60);
		s.mul(60,70);
		s.div(489, 60);
		
		

	}

}
