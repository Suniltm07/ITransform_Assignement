package com.capg.springmvc;

import java.util.List;

public interface EmployeeDao 
{
	    public void saveEmployee(Employee employee);
	    public Employee getEmployeeById(int id);
	    public void updateEmployee(Employee employee);
	    public void deleteEmployee(int id);
	    public List<Employee> getAllEmployees();

}
