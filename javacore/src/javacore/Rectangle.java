package javacore;

public class Rectangle {
	
	int area(int l,int b)
	{
		return l*b;
	}
	
	int perimeter( int l, int b)
	{
		return 2*(l+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle s=new Rectangle();
		System.out.println("area of the rectangle"+s.area(55,60));
		System.out.println("perimeter of the rectangle"+s.perimeter(55,90));

	}

}

