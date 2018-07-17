package com.entity;

/**
 * Room entity. @author MyEclipse Persistence Tools
 */

public class Room implements java.io.Serializable {

	// Fields

	private String roomcode;
	private String roomstate;
	private String roomname;

	// Constructors

	/** default constructor */
	public Room() {
	}

	/** full constructor */
	public Room(String roomcode, String roomstate, String roomname) {
		this.roomcode = roomcode;
		this.roomstate = roomstate;
		this.roomname = roomname;
	}

	// Property accessors

	public String getRoomcode() {
		return this.roomcode;
	}

	public void setRoomcode(String roomcode) {
		this.roomcode = roomcode;
	}

	public String getRoomstate() {
		return this.roomstate;
	}

	public void setRoomstate(String roomstate) {
		this.roomstate = roomstate;
	}

	public String getRoomname() {
		return this.roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

}