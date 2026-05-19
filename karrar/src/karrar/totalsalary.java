package karrar;

public class totalsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='a';
		double basicpay=40000;
		double hra =0.2*basicpay;
		double da=0.5*basicpay;
		double pf=0.11*basicpay;
		double allow;
		 
		if (grade=='a')
			
		{
			allow=1500;
		}
		else if (grade=='b')
		
		{
		   allow=1800;
		}
		
		   else
		   {
			allow=1400;   
		   }
		double totalsalary=basicpay+hra+da+allow-pf;
		
		System.out.println("total salary"+ totalsalary);
		
	}
}

