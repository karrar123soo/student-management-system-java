                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 package javacore2;

public class Library {
	String book[]=
		{"empty","empty","empty","empty"};
	
	void display()
	
	{
		System.out.println("Book in library");
		
		for(String i:book)
		{
			System.out.println(i);
			
		}
	}
	void add(String s)
	{
		for(int i=0;i<book.length;i++)
		{
			if(book[i]=="empty")
			{
				book[i]=s;
				break;
			}
		}
	}
	void remove(String s)
	{
		for(int i=0;i<book.length;i++)
		{
			if(book[i]==s)
			{
				
			}
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library m=new Library();
		m.display();
		m.add("java");
		m.display();
		m.remove("java");
		m.display();

	}

}
