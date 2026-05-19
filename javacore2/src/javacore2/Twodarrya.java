package javacore2;

public class Twodarrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{44,55,77,88},{55,77,88,99},{44,11,22,33}};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[i][j];
				//sysout.out.print(arr[i][j]+"");
			}
			System.out.println();
		
		
		System.out.println("sum of all the element"+sum);

	}

}
}

