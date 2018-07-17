package com.service.impl;

import java.util.List;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeedao) {
		this.employeeDao = employeedao;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeDao.addEmployee(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeDao.updateEmployee(employee);
	}

	@Override
	public void delEmployee(String employeeId) {
		// TODO Auto-generated method stub
		this.employeeDao.delEmployee(employeeId);
	}

	@Override
	public Employee findById(Employee employee) {
		// TODO Auto-generated method stub
		return this.employeeDao.findById(employee);
	}

	@Override
	public Employee findByEmployeeId(Employee employee) {
		// TODO Auto-generated method stub
		return this.employeeDao.findByEmployeeId(employee);
	}

	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		Employee e = this.findByEmployeeId(employee);
		if(e != null){
			if(employee.getPassword().equals(e.getPassword())){
				return e;
			}
		}
		return null;
	}

	@Override
	public void updatePassword(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeDao.updatePassword(employee);
	}

	@Override
	public String updatePassword(Employee employee, String oldpwd, String newpwd) {
		// TODO Auto-generated method stub
		String result = null;
		if (oldpwd.equals(employee.getPassword()))
		{
			employee.setPassword(newpwd);
			this.employeeDao.updatePassword(employee);			
			result = "修改成功";
		}
		else
		{
			result = "原密码错误";
		}
		return result;
	}

	@Override
	public List<Employee> listEmployees(int offset, int pagesize) {
		// TODO Auto-generated method stub
		return this.employeeDao.listEmployees(offset, pagesize);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.employeeDao.getCount();
	}

}
