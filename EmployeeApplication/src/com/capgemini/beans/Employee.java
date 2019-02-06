package com.capgemini.beans;

public class Employee {
	private String name;
	private Address address;
	private int id;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Address address, int id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", id=" + id + "]";
	}
	

}
