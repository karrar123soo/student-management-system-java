package javacore2;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	public int getid() {
		return id;
	}
	public void setid (int id) {
		this.id=id;
	}
		
		public String getName () {
			return name;
		}
		public void setName (String name) {
			this.name=name;
		}
		public int getsalary() {
			return salary;
		}
		public void setsalary(int salary) {
			this.salary=salary;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee h=new Employee();
		h.setsalary(5000);
		System.out.println(h.getsalary());
		
		h.setName("raman");
		System.out.println(h.getName());
		
		h.setid(250);
		System.out.println(h.getid());

	}

}
