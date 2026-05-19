package javacore;
abstract class tyre
{
	abstract int vehicle();
}
class  vehicle extends tyre
{
	 int vehicle () {
		// TODO Auto-generated method stub
		return 2;
	}
}
class car extends tyre
{
	 int vehicle() {
	//TODO Auto-generated method stub 
	return 4;
}


}
class truck extends tyre
{
	int vehicle() {
	//TODO Auto-generated method stub
	return 16;
}

}





public class BIKE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tyre t;
		t=new  vehicle();
		System.out.println(t.vehicle ());
		
		t=new car();
		System.out.println(t.vehicle());
		t=new truck();
		System.out.println(t.vehicle());
	
				
				

	}

}
