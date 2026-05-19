package javacore;
class Addition
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
}
class subtraction extends Addition
{
	void sub(int a, int b)
	{
		System.out.println(b-a);
	}
}
class Multiplication extends subtraction
{
	void multi(int a, int b)
	{
		System.out.println(a*b);
	}
}

public class Division extends Multiplication {
	void div(int a, int b)
	{
		System.out.println(b/a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division s=new  Division();
		s.add(55, 60);
		s.multi(60, 70);
		s.div(50, 2);
		s.sub(489, 60);
		

	}

}
