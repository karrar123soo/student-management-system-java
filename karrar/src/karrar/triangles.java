
package karrar;

public class triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int side1=44,side2=44, side3=44;
	if(side1==side2&&side2==side3)
	{
		System.out.println("equilateral triangle");
	}
	else if(side1==side2||side2==side3||side1==side3)
	{
		System.out.println("isoceles triangle");
	}
	else
	{
		System.out.println("scalene triangle");
	}

	}

}
