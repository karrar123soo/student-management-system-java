package crs;
import java.util.ArrayList;
import java.util.Iterator;

public class An {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a=new ArrayList();
		a.add("akshay");
		a.add("raman");
		a.add("suman");
		a.add(40.565);
		a.add('a');
		
		System.out.println(a);
		System.out.println(a.size());
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.contains("akshay"));
		
		ArrayList b=new ArrayList();
		b.add("ram");
		b.add("shyam");
		
		a.addAll(b);
		System.out.println(a);
		
		Iterator itr=null;
		itr=a.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
