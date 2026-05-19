package mm;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>
	li=Arrays.asList(55,66,7,8,9,5454,6565,56);
		
		Collections.sort(li);
		System.out.println("Element Ater sorted");
		System.out.println(li);
		
		System.out.println("Element in shuffle");
		Collections.shuffle(li);
		System.out.println(li);
		System.out.println("Element in reverse order");
		
		Collections.sort(li,Collections.reverseOrder());
		
		System.out.println(li);
		
		

	}

}
