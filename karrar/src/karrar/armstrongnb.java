package karrar;

public class armstrongnb {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		int num=153,n,r,sum=0;
		n=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			n=num/10;
		}
		if (sum==n)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("normal number");
		}

	}

}
