package com.capgemini.beans;

public class Student {
	private int rollNumber;
	private String name;
	private String[] courses;
	private int noOfCourses;
	
	public int getNoOfCourses() {
		return noOfCourses;
	}
	public void setNoOfCourses(int noOfCourses) {
		this.noOfCourses = noOfCourses;
	}
	public Student(int rollNumber, String name,String[] courses,int nc) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.courses=courses;
		this.noOfCourses = nc;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
