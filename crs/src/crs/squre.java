package crs;
public class squre {
	double area (double side)
	{
		return side*side;
	}
	double perimeter(double side)
	{
		return 4*side;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squre m=new squre();
		System.out.println(m.area(55));
		System.out.println(m.perimeter(66));

	}

}
