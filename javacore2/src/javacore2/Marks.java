package javacore2;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{44,88,77,55}};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[i][j];
				//system.out.print(arr[i][j]+"");
				
			}
			System.out.println();
		
		}
		System.out.println("sum of all the elements"+sum);
		System.out.println("persentage of all elemente"+0.44*100);
	}

}
