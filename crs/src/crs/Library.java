package crs;

public class Library {
	String books []= {"empty","empty","empty","empty"};
	void display()
	{
		System.out.println("Book in library");
		for (String i:books)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library m=new Library();
		m.display();

	}

}
