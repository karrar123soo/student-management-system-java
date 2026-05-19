package crs;

public class pt {
	static int linearsearch (int arr[],int x)
	{
		for (int i=0;i<arr.length;i++)
			
			if (arr[i]==x)
			{
				return i;
			
		
	}
	return 0;
}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {55,77,88,99,66,77};
		int x=88;
		System.out.println(linearsearch(arr,x));
	}
}
