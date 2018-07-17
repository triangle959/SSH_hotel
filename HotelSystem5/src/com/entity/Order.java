package com.entity;

import java.util.Date;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private String username;
	private String employeeId;
	private String roomname;
	private String orderstate;
	private String roomcode;
	private Date orderdate;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(String username, String roomname, String orderstate,
			Date orderdate) {
		this.username = username;
		this.roomname = roomname;
		this.orderdate = orderdate;
		this.orderstate = orderstate;
	}

	/** full constructor */
	public Order(String username, String employeeId, String roomname,
			String orderstate, String roomcode) {
		this.username = username;
		this.employeeId = employeeId;
		this.roomname = roomname;
		this.orderstate = orderstate;
		this.roomcode = roomcode;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getRoomname() {
		return this.roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public String getOrderstate() {
		return this.orderstate;
	}

	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}

	public String getRoomcode() {
		return this.roomcode;
	}

	public void setRoomcode(String roomcode) {
		this.roomcode = roomcode;
	}

}