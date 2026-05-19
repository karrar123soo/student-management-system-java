package crs;

import java.util.Vector;

public class vectorg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.addElement("akshay");
		v.addElement(4546);
		v.addElement("raman");
		v.add(40.565);
		System.out.println(v);
		
		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
		
		System.out.println(v.elementAt(1));
		

	}

}
