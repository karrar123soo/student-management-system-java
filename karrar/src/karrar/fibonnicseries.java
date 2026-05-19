package karrar;

public class fibonnicseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		System.out.println(n1+""+n2+"");
		
		for (int i=2;i<10;i++)
		{
			int n3=n2+n1;
			System.out.println(n3+"");
			n1=n2;
			n2=n3;
		}

	}

}
