package crs;

public class sty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder m=new
				StringBuilder("akshay");
		System.out.println(m);
		// m.append("chauhan");
		System.out.println(m);
		
		System.out.println(m.length());
		
		System.out.println(m.capacity());
		
		System.out.println(m.insert(1, "ram"));
		m.ensureCapacity(100);
		System.out.println(m.capacity());
		
		m.trimToSize();
		System.out.println(m.capacity());
				

	}

}
