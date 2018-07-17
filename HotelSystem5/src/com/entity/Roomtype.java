package com.entity;

/**
 * Roomtype entity. @author MyEclipse Persistence Tools
 */

public class Roomtype implements java.io.Serializable {

	// Fields

	private String roomId;
	private String roomname;
	private Integer price;
	private Integer total;
	private Integer surplus;
	private String description;

	// Constructors

	/** default constructor */
	public Roomtype() {
	}

	/** minimal constructor */
	public Roomtype(String roomId, String roomname, Integer price, Integer total) {
		this.roomId = roomId;
		this.roomname = roomname;
		this.price = price;
		this.total = total;
	}

	/** full constructor */
	public Roomtype(String roomId, String roomname, Integer price,
			Integer total, Integer surplus, String description) {
		this.roomId = roomId;
		this.roomname = roomname;
		this.price = price;
		this.total = total;
		this.surplus = surplus;
		this.description = description;
	}

	// Property accessors

	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRoomname() {
		return this.roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getSurplus() {
		return this.surplus;
	}

	public void setSurplus(Integer surplus) {
		this.surplus = surplus;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}