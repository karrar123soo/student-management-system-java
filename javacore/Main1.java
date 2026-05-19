package javaproject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("\n1.Add student");
			System.out.println("2.Show student");
			System.out.println("3.exit");
			
			System.out.println("Enter choice");
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			if(choice==1) {
				try {
				FileWriter writer=new FileWriter("student.txt",true);
				
				System.out.println("Enter name:");
				String name=sc.nextLine();
				
				writer.write(name+"/n");
				writer.close();
				
				System.out.println("student saved file");
				
			}catch (IOException e) {
				System.out.println("Error writing file");
			}
				
			}
			else if(choice==2) {
				try {
					File file=new File("student,txt");
					if(!file.exists()) {
						System.out.println("file not found,please add student firts");
						continue;
					}
					Scanner fileReader=new Scanner(file);
					
					System.out.println("Student List:");
					
					while(fileReader.hasNextLine()) {
						System.out.println(fileReader.nextLine());
					}
					fileReader.close();
					
					
				} catch(Exception e) {
					System.out.println("error reading file");
				}
			}
			//Exit
			else if(choice==3) {
				System.out.println("program ended");
				break;
			}
			else {
				System.out.println("Invalid choice");
			}
		}
		
				
				
				
				
				
				
				
				
				
			}
		

	}


