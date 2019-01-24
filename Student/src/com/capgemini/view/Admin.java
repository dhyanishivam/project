package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.bl.StudentSchedular;

public class Admin {
	private static Scanner sc=new Scanner(System.in);
	private static StudentSchedular studSch = new StudentSchedular();
	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {
		
		int choice;
		
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1. Add Student");
			System.out.println("2. Show all Students");
			System.out.println("3. Show student by rollno.");
			System.out.println("4. exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:addStudentDetails();
			       break;
			 case 2:showAllStudents();
			        break;
			 case 3:showStudentByRollNumber();
			 		break;
			 case 4:System.exit(0);
			 default:System.out.println("Sorry entered wrong choice");
				   
			  
				   
			   
			}
			
		}
		
	}

	private static void showStudentByRollNumber() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		System.out.println(studSch.studentByRollNumber(rollNumber));
		
	}

	private static void showAllStudents() {
		System.out.println(studSch.showAllStudents());
		
	}

	private static void addStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter number of courses");
		int nCourses=sc.nextInt();
		String[] courses=new String[nCourses];
		System.out.println("enter the courses");
		for(int i=0; i<nCourses; i++)
		{
			courses[i]=sc.next();
		}
		
		System.out.println(studSch.addStudent(rollNumber, name,courses,nCourses));
		
	}

}
