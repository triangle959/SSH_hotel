package com.action;

import java.awt.Window;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.entity.Order;
import com.entity.Roomtype;
import com.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderService;

public class OrderAction extends ActionSupport{
	
	private OrderService orderService;
	private Order order;
	private User user;
	private Roomtype roomtype;
	
	private String username;
	private String roomname;
	private Date orderdate;
	
	
	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public Roomtype getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderservice) {
		this.orderService = orderservice;
	}
	
	@SuppressWarnings("unchecked")
	public String createOrder() throws ParseException{
		HttpServletRequest request = ServletActionContext.getRequest();
		User user = (User) request.getSession().getAttribute("user");
		List<Roomtype> roomtype =  (List<Roomtype>) request.getSession().getAttribute("roomtypes");
		String roomname =  (String) request.getParameter("roomname");
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date orderdate = df.parse(df.format(day));
		System.out.println(roomname);
		System.out.println(user);	
		System.out.println(roomtype);
			Order order = new Order();
			order.setUsername(user.getUsername());
			order.setRoomname(roomname);
			order.setOrderstate("已预订");
			order.setOrderdate(orderdate);
		if(order!=null){
			orderService.addOrder(order);
			findByUser();
			System.out.println("预订成功");
		}
		return "orderSucc";
	}
	
	@SuppressWarnings("unchecked")
	public String findByUser(){
		HttpServletRequest request = ServletActionContext.getRequest();
		User user = (User) request.getSession().getAttribute("user");
		String username = user.getUsername();
		List<Order> orders = orderService.findByusername(username);
		((Map<String, Object>) ActionContext.getContext().get("session")).put("orders",orders);
		return "readOrder";
	}
}
