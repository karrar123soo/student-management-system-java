package karrar;

public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121,n,rev=0,digit;
		n=num;
		while(num>0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			
		}
		if(rev==n)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("normal number");
		}

	}

}
