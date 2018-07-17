package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.EmployeeDao;
import com.entity.Employee;


public class EmployeeDaoImpl implements EmployeeDao{

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(employee);
	}

	@Override
	public void delEmployee(String employeeId) {
		// TODO Auto-generated method stub
		Employee employee = this.hibernateTemplate.get(Employee.class, employeeId);
		this.hibernateTemplate.delete(employee);
	}

	@Override
	public Employee findById(Employee employee) {
		// TODO Auto-generated method stub
		String hql = "from Employee as e where e.id=" + employee.getEmployeeId();
		List list = this.hibernateTemplate.find(hql);
		Employee employee2 = (Employee)list.get(0) ;
		return employee2;
	}

	@Override
	public Employee findByEmployeeId(Employee employee) {
		// TODO Auto-generated method stub
		String hql = "from Employee as e where e.employeeId=" + employee.getEmployeeId();
		List list = this.hibernateTemplate.find(hql);
		Employee employee3 = (Employee)list.get(0) ;
		return employee3;
	}

	@Override
	public List<Employee> listEmployees(int offset, int pagesize) {
		// TODO Auto-generated method stub
		String hql = "from Employee";
		Session session = this.hibernateTemplate.getSessionFactory().openSession();
		List<Employee> employees = session.createQuery(hql).setFirstResult(offset).setMaxResults(pagesize).list();
		return employees;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Employee";
		List list = this.hibernateTemplate.find(hql);
        int count = ((Long) list.get(0)).intValue();
		return count;
	}

	@Override
	public void updatePassword(Employee employee) {
		// TODO Auto-generated method stub
		employee.setPassword(employee.getPassword());
		this.hibernateTemplate.update(employee);
	}

}
