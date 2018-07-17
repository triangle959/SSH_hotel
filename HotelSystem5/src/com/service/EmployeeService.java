package com.service;

import java.util.List;

import com.entity.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public void delEmployee(String employeeId);
	
	public Employee findById(Employee employee);
	
	public Employee findByEmployeeId(Employee employee);
	
	public Employee login(Employee employee);
	
	public void updatePassword(Employee employee);
	
	public String updatePassword(Employee employee,String oldpwd,String newpwd);
	
	public List<Employee> listEmployees(int offset,int pagesize);
	
	public int getCount();
}
