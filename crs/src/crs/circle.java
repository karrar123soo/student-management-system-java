package crs;

public class circle {
	float pi=3.14f;
	float area (int r)
	{
		return pi*r*r;
	}
	float perimeter(float pi,int r)
	{
		return 2*pi*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		System.out.println(c.area(4));
		System.out.println(c.perimeter(3.14f,5));

	}

}
