package javacore;
class papa
{
	void papa()
	{
		System.out.println("Im papa");
	}
}
class bro extends papa
{
	void bro()
	{
		System.out.println("Im bro");
	}
}
class sis
{
	void sis ()
	{
	System.out.println("Im sis");	
	}
}


public class ky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bro b=new bro();
		b.bro();
		b.papa();
	
	}

	}


