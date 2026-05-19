package student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyThread extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
}

public class pm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("Students.txt");
			Scanner sc=new Scanner(file);
			
			List<String> Students=new ArrayList<>();
			
			//Read file
			while(sc.hasNextLine()) {
			Students.add(sc.nextLine());
			
		}
			sc.close();
			//Name > 4 letters +uppercase
			System.out.println("Names >4 letters (UPPERCASE)");
			Students.stream()
			        .filter(name->name.length()>4)
			        .map(name->name.toUpperCase())
			         .forEach(name->System.out.println(name));
			
			// count total students
			long count=Students.stream().count();
			System.out.println("Total Students :"+count);
			
			// filter names starting with a
			System.out.println("Name starting with a");
			Students.stream()
			        .filter(name-> name.startsWith("a"))
			        .forEach(name->System.out.println(name));
			
			// Thread start
			MyThread t=new MyThread();
			t.start();
		}catch(Exception e) {
			System.out.println("error");
			
			
			
			
			
			
			
		}
				}

}

