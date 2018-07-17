package com.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.dao.RoomtypeDao;
import com.entity.Roomtype;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomtypeService;

public class RoomtypeAction extends ActionSupport{

	private String roomname;
	private int price;
	private String total;
	private String surplus;
	private String description;
	private Roomtype roomtype;
	private RoomtypeService roomtypeService;
	
	@SuppressWarnings("unchecked")
	public String ListRoomtype() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Roomtype> roomtypes = this.roomtypeService.listRoomtypes();
		((Map<String, Object>) ActionContext.getContext().get("session")).put("roomtypes",roomtypes);
		request.getSession().setAttribute("roomtypes", roomtypes);
		System.out.println("ddddddddddddd"+roomtypes.size());
		return "listRoomtype";
	}

	public Roomtype getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	public RoomtypeService getRoomtypeService() {
		return roomtypeService;
	}

	public void setRoomtypeService(RoomtypeService roomtypeService) {
		this.roomtypeService = roomtypeService;
	}
	
	
}
