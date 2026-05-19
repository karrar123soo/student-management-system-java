package javacore2;
abstract class Bank
{
	abstract int ratreofinterst();
}

class Pnb extends Bank
{
	@Override
	int ratreofinterst() {
		//TODO Auto-generated method stub 
		return 8;
	}
}
class Sbi extends Bank
{
	@Override
	int ratreofinterst() {
		return 19;
	}
}

class Axis extends Bank
{
	@Override
	int ratreofinterst() {
		//TODO Auto-generated method stub
		return 10;
	}
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		
		b=new Pnb();
		System.out.println(b.ratreofinterst());
		
		b=new Sbi();
		System.out.println(b.ratreofinterst());
		
		b=new Axis ();
		System.out.println(b.ratreofinterst());
		
		

	}

}
