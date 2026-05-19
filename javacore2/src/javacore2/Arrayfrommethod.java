package javacore2;

public class Arrayfrommethod 
{
	static int[]print()
	{
		return new int[] {44,66,7,78,88,777};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int get []=print();
		
		for (int i:get)
		{
			System.out.println(i);
		}

	}

}
