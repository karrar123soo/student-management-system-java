package mm;
abstract class Tyre
{
	abstract int nooftyre();
}
class Bike extends Tyre
{
	@Override
	int nooftyre() {
	//TODO Auto-generated method stub 
		return 2;
	}
	
	
}
class Car extends Tyre
{
	@Override
	int nooftyre() {
		//TODO Auto-generated method stub
		return 4;
	}


	
}
class Truck extends Tyre
{
	@Override
	int nooftyre() {
		//TODO Auto-generated method stub
		return 8;
	}
}

public class pc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tyre b;
		b=new Bike();
		System.out.println(b.nooftyre());
		
		b=new Car();
		System.out.println(b.nooftyre());
		
		
		b=new Truck();
		
		System.out.println(b.nooftyre());

	}

}
