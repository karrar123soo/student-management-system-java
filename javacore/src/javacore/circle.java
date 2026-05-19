package javacore;

public class circle {
	
	double area(double radius)
	{
		
		return 3.14*radius*radius;
	}
	double perimeter (double radius)
	{
		return 2*3.14*radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle m=new circle();
		System.out.println("area of the circle"+m.area(50.66));
		
		System.out.println("perimeter of the circle"+m.perimeter(96.366));

	}

}
