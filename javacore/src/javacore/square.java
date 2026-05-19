package javacore;

public class square {
	
	int area(int side)
	{
		return side*side;
	}
	int perimeter (int side)
	{
		return 2*side;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square m=new square();
	System.out.println("Area of the square"+m.area(50));
	
	System.out.println("perimeter of the square"+m.perimeter(63));
	
	}
}

		
