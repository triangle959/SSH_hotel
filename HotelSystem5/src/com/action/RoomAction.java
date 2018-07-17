package com.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import com.entity.Room;
import com.entity.Roomtype;
import com.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;
import com.service.RoomtypeService;

public class RoomAction extends ActionSupport{

	private String roomcode;
	private String roomname;
	private String state;

	
	private Room room;
	private RoomService roomService;
	
	
	@SuppressWarnings("unchecked")
	public String ListRoom(){
		List<Room> roomlist = roomService.listRooms();
		//System.out.println(list);
		((Map<String, Object>) ActionContext.getContext().get("session")).put("roomList",roomlist);	
		return "roomlist";
	}

	
	public String addRoom(){
		room = this.getRoom();
		roomService.addRoom(room);
		return "addSuccess";
	}

	public String delRoom(){
		roomcode = this.getRoom().getRoomcode();
		roomService.delRoom(roomcode);
		return "delSuccess";
	}
	
	public String updRoom(){
		room = this.getRoom();
		roomService.updateRoom(room);
		return "updSucc";
	}
	
	public String modifyState(){
		roomname = this.getRoomname();
		roomcode = this.getRoomcode();
		state = "已预定";
		Room room = new Room(roomname,roomcode,state);
		roomService.updateRoom(room);
		return "modifyStateSucc";
	}
	
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getRoomcode() {
		return roomcode;
	}

	public void setRoomcode(String roomcode) {
		this.roomcode = roomcode;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public RoomService getRoomService() {
		return roomService;
	}


	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	
}
