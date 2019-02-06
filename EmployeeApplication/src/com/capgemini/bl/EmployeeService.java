package com.capgemini.bl;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;

public interface EmployeeService {

	Employee createEmployee(String name, Address address,int id);

	List<Employee> searchByName(String name);

}