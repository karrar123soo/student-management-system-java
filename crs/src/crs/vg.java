package crs;
import java.util.ArrayList;
import java.util.Iterator;

public class vg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
				a.add("tomato");
				a.add("onion");
				a.add("carot");
				a.add("spinach");
				a.add("Bitter Gourd");
				
				System.out.println(a);
				
				System.out.println(a.size());
				
				System.out.println(a.isEmpty());
				
				System.out.println(a.contains("tomato"));
				
				
				ArrayList b=new ArrayList();
				
				b.addAll(b);
				
				System.out.println(a);
				
				Iterator itr=null;
				
				itr=a.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				
		

	}

}
