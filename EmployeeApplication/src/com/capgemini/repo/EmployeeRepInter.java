package com.capgemini.repo;

import java.util.List;

import com.capgemini.beans.Employee;

public interface EmployeeRepInter {
	Employee save(Employee employee);
	List<Employee> findByName(String name);

}