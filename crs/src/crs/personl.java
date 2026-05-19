package crs;

public class personl {
	//global variable or instance variable
	String name;
	int age;
	void insert(int a,String b)
	{
		age=a;
		name=b;
	}
	void display()
	{
		System.out.println("your name is"+name);
		System.out.println("your age is"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personl m=new personl();
		m.insert(55,"akshay");
		
		m.display();

	}

}
