package com.dao;

import java.util.List;

import com.entity.Employee;
import com.entity.User;

public interface EmployeeDao {

	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public void delEmployee(String employeeId);
	
	public Employee findById(Employee employee);
	
	public Employee findByEmployeeId(Employee employee);
	
	public void updatePassword(Employee employee);
	
	public List<Employee> listEmployees(int offset,int pagesize);
	
	public int getCount();
}
