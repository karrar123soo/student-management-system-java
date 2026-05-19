package javacore;

public class Tarun {
	
	private String name;
	
	public String getName(){
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarun m=new Tarun();
		m.setName("akshay");
		System.out.println(m.getName());

	}

}
