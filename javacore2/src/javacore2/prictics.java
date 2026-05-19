package javacore2;

public class prictics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks []= {40,70,60,80,30,20};
		int sum=0;
		for (int i:marks)
		{
			sum=sum+i;
		}
		System.out.println("sum of all the marks"+sum);
		System.out.println("Average of all the marks"+(sum/marks.length));

	}

}
