package com.entity;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private String employeeId;
	private String name;
	private String sex;
	private String password;
	private Integer workyear;
	private String phone;
	private String job;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(String employeeId, String name, String sex,
			String password, String job) {
		this.employeeId = employeeId;
		this.name = name;
		this.sex = sex;
		this.password = password;
		this.job = job;
	}

	/** full constructor */
	public Employee(String employeeId, String name, String sex,
			String password, Integer workyear, String phone, String job) {
		this.employeeId = employeeId;
		this.name = name;
		this.sex = sex;
		this.password = password;
		this.workyear = workyear;
		this.phone = phone;
		this.job = job;
	}

	// Property accessors

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getWorkyear() {
		return this.workyear;
	}

	public void setWorkyear(Integer workyear) {
		this.workyear = workyear;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}