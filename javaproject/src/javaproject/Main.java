package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int id ;
	String name;
	int marks;
	
	Student (int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		ArrayList<Student> Students=new ArrayList();
		
		while (true) {
			System.out.println("1.Add Student");
			System.out.println("2.show Student");
			System.out.println("3.search Student");
			System.out.println("4.	Remove student");
			
			System.out.println("5.Enter choice");
			int choice=sc.nextInt();
			
			if (choice==1) {
				System.out.println("Enter ID:");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Name:");
				String name=sc.nextLine();
				
				System.out.println("Enter marks:");
				
				int marks=sc.nextInt();
				
				Students.add(new Student(id,name,marks));
				
				System.out.println("Student added suceccfully");
			}
		
		else if(choice==2) {
			for(Student s: Students) {
				System.out.println("ID:"+s.id+"Name:"+s.name+"Marks:"+s.marks);
			}
		}
		else if(choice==3) {
			System.out.println("Enter Id to search:");
			int id=sc.nextInt();
			boolean found=false;
			
			
			for(Student s:Students) {
				if(s.id==id) {
					System.out.println("ID:"+s.id+"Name:"+s.name+"marks:"+s.marks);
					found=true;
				}
			}
			if(!found) {
				System.out.println("Student not found");
			}
		}
		else if(choice==4) {
			System.out.println("Enter ID to remove");
			int id=sc.nextInt();
			
			Students.removeIf(s ->s.id==id);
			
			System.out.println("Student Removed");
		}
		else if(choice==5) {
			System.out.println("program ended");
			break;
		}
		else {
			System.out.println("Invalid choice");
				}
				
			}
			
			
			}
		

	}


