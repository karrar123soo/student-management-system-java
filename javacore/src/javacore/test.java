package javacore;
abstract class Bank
{
	abstract int rateofinterst();
}

class pnb extends Bank
{
	@Override
	int rateofinterst() {
		//TODO Auto-genrated method stub
		return 8;
	}
}

class sbi extends Bank
{
	@Override
	int rateofinterst() {
		//TODO Auto-genrated method stub
		return 19;
	}
	
}
class Axis extends Bank
{
	@Override
	int rateofinterst() {
		//TODO Auto-genrated method stub
		return 10;
	
		
	}
}
	
	


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new pnb();
		System.out.println(b.rateofinterst());
		b=new sbi();
		System.out.println(b.rateofinterst());
		
		b=new Axis();
		System.out.println(b.rateofinterst());
	}
}

