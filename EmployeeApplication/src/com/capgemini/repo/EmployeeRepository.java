package com.capgemini.repo;

import java.util.*;

import com.capgemini.beans.Employee;

public class EmployeeRepository implements EmployeeRepInter {
	Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
	
	public Employee save(Employee employee)
	{
		employees.put(employee.getId(),employee);
		return employee;
	}
	
	public List<Employee> findByName(String name)
	{
		Set<Map.Entry<Integer,Employee> > st= employees.entrySet();
		List<Employee> details = new ArrayList<>();
		for(Map.Entry<Integer,Employee> i:st)
		{
			if(i.getValue().getName().equals(name))
			{
				
				details.add(i.getValue());
			}
		}
		return details;
		
	}

}
