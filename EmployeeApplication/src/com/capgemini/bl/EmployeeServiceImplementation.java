package com.capgemini.bl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.repo.EmployeeRepInter;

public class EmployeeServiceImplementation implements EmployeeService {
	
	EmployeeRepInter employeeRepository;
	
	
	public EmployeeServiceImplementation(EmployeeRepInter employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	/* (non-Javadoc)
	 * @see com.capgemini.bl.EmployeeService#createEmployee(java.lang.String, com.capgemini.beans.Address)
	 */
	@Override
	public Employee createEmployee(String name, Address address, int id)
	{
		Employee employee = new Employee(name,address,id);
		return employeeRepository.save(employee);
	}
	/* (non-Javadoc)
	 * @see com.capgemini.bl.EmployeeService#searchByName(java.lang.String)
	 */
	@Override
	public List<Employee> searchByName(String name)
	{
		return employeeRepository.findByName(name);
	}
	


}
