package crs;

public class str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="akshay is a ajava developer";
		String m="AKASHAY";
		System.out.println(name.length());
		System.out.println(name.charAt(1));
		
		System.out.println(name.toUpperCase())
		;
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.trim());
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||
					name.charAt(i)=='e'||
					name.charAt(i)=='i'||
					name.charAt(i)=='o'||
					name.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("no of vowels"+count);
		
		
		
	}

}
