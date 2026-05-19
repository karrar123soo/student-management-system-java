package crs;
import java.util.LinkedList;

public class oo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(4546);
		l.add(45456);
		l.add("akshay");
		l.add("karan");
		l.addLast("suman");
		l.addFirst("ram");
		
		System.out.println(l);
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);

	}

}
