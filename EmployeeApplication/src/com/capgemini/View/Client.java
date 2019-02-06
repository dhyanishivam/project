package com.capgemini.View;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Employee;
import com.capgemini.bl.EmployeeServiceImplementation;
import com.capgemini.repo.EmployeeRepInter;
import com.capgemini.repo.EmployeeRepository;

public class Client {

	public static void main(String[] args) {
		EmployeeRepInter repo = new EmployeeRepository();
		EmployeeServiceImplementation esi = new EmployeeServiceImplementation(repo);
		
		City city = new City("Pune");
		Country country = new Country("India",city);
		Address address = new Address("Talwade",country);
		esi.createEmployee("Shivam", address, 100);
		System.out.println(esi.searchByName("Shivam"));
		

	}

}
