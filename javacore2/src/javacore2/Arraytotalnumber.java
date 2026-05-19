package javacore2;

public class Arraytotalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks []= {66,77,88,99,44,55};
		int sum=0;
		for(int i:marks)
		{
			sum=+i;
		}
		System.out.println("sum of all the marks"+sum);
		
		System.out.println("Average of all the marks "+(sum/marks.length));
	
	}
}

