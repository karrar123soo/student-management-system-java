package crs;
import java.util.ArrayList;
import java.util.List;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>
		e=List.of(11,22,55,66,999,843,77865);
		ArrayList even=new ArrayList();
		
		for(Integer i:e)
		{
			if(i%2==0)
			{
				even.add(i);
			}
		}
		System.out.println("Even numbar"+even);

	}

}
