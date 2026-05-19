package crs;
import java.util.Enumeration;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack l=new Stack();
		l.push(4556);
		l.push(52);
		l.push(899);
		l.push(28);
		System.out.println(l.pop());
		System.out.println(l.peek());
		System.out.println(l.search(52));
		System.out.println(l.isEmpty());
		
		Enumeration en=null;
		
		en=l.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		

	}

}
