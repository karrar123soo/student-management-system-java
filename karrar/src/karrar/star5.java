package karrar;

public class star5 {

	public static void main(String[] args) {
		int k='A';
		// TODO Auto-generated method stu
		for (int j=1; j<=4; j++)
		{
			for (int i=1;i<=j;i++)
			{
			if(i+j%2==0)	
				{
					System.out.print("1"+"  ");
				}
				else
				{
					System.out.print("0"+" ");
				}
				
				k++;
				
			}
			System.out.println();
		}
	}
}


