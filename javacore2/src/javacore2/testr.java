package javacore2;
interface Aa
{
	//by default public and abstract
	
	void akshay();
	void raman();
	void rinku();
}

class D implements Aa
{
	@Override
	public void akshay() {
		//TODO Auto-generated method stub
		System.out.println("akshay is running");
	}
	
@Override
public void raman() {
	//TODO AUto-generated method stub
	
	System.out.println("raman is running");
}
public void rinku() {
	//TODO Auto-generated method stub
	System.out.println("rinku is running");
}
}







public class testr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a;
		a=new D();
		a.akshay();
		a.raman();
		a.rinku();

	}

}
