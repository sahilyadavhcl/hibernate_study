package com.hcl.dao;

import java.util.List;

import com.hcl.model.Employee;
 
public interface EmployeeDao {
	void insertEmployee(Employee cus);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(String empId);
}