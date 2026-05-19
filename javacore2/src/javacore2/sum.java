package javacore2;

public class sum {
	//by changin number of arguments
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum s=new sum();
		s.add(55, 66);
		s.add(44, 20,60);

	}

}
