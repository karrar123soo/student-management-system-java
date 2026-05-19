package crs;

public class Strw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m=new String("akshay is a java");
		
		String k=new String("a");
		
		System.out.println(m==k);
		System.out.println(m.equals(k));
		
		System.out.println(m.equalslgnoreCase(k));
		
		System.out.println(m.contains("akshay"));
		
		//
		System.out.println(m.substring(4,10));
		System.out.println(k.compareTo(m));
		
		System.out.println(m.startswith("b"));
		System.out.println(m.endsWith("a"));

	}

}
