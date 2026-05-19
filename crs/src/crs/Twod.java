package crs;

public class Twod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[4][4];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<4;j++)
					{
						System.out.println(arr[i][j]+"");
					}
					System.out.println();
				}
	}
}
