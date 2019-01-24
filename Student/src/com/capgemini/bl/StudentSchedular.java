package com.capgemini.bl;

import com.capgemini.beans.Student;

public class StudentSchedular {
	private Student[] students = new Student[10];
	private int counterStudent;
	
	public String addStudent(int rollNumber,String name,String[] course,int nCourses)
	{
		if(check(rollNumber))
		{
			students[counterStudent++]=new Student(rollNumber,name,course,nCourses);
			return "Student added successfully";
		}
		else
		{
			return "This roll Number is already present";
		}
	}
	
	private boolean check(int rollNumber) {
		for(int i=0; i<counterStudent; i++)
		{
			if(students[i].getRollNumber()==rollNumber)
			{
				return false;
			}
		}
		return true;
	}

	public String showAllStudents()
	{
		String s="";
		for(int i=0;i<counterStudent;i++)
		{
			s=s+students[i].getRollNumber()+" ";
			s=s+students[i].getName()+" ";
			String[] courses=students[i].getCourses();
			for(int j=0; j<students[i].getNoOfCourses(); j++)
			{
				s=s+students[i].getCourses()[j];
			}
		}
		return s;
	}

	public String studentByRollNumber(int rollNumber) {
		for(int i=0;i<counterStudent;i++)
		{
			if(rollNumber == students[i].getRollNumber())
			{
				return students[i].getName();
			}
		}
		return "Roll Number Not Found";
	}

}
