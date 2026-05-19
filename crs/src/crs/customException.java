package crs;


import java.io.IOException;

public class customException {
	
	static public void show()throws IOException
	{
		throw new IOException("io exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			show();
		}
		catch(Exception w)
		{
			System.out.println(w);
		}

	}

}
