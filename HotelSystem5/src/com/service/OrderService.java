package com.service;

import java.util.List;

import com.entity.Order;

public interface OrderService {

	public List<Order> listOrders(int offset,int pagesize);
	
	public void addOrder(Order order);
	
	public void deleteOrder(Order order);
	
	public List<Order> unfinishOrders(int offset,int pagesize);
	
	public void changeOrderState(Order order,String orderstate);
	
	public List<Order> findByusername(String username);
}
