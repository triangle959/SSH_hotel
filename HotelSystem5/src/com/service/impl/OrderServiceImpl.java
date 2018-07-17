package com.service.impl;

import java.util.List;

import com.dao.OrderDao;
import com.entity.Order;
import com.service.OrderService;

public class OrderServiceImpl implements OrderService{

	private OrderDao orderDao;

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public List<Order> listOrders(int offset, int pagesize) {
		// TODO Auto-generated method stub
		return this.orderDao.listOrders(offset, pagesize);
	}

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.addOrder(order);
	}

	@Override
	public void deleteOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.deleteOrder(order);
	}

	@Override
	public List<Order> unfinishOrders(int offset, int pagesize) {
		// TODO Auto-generated method stub
		return this.orderDao.unfinishOrders(offset, pagesize);
	}

	@Override
	public void changeOrderState(Order order,String orderstate) {
		// TODO Auto-generated method stub
		this.orderDao.changeOrderState(order,orderstate);
	}

	@Override
	public List<Order> findByusername(String username) {
		// TODO Auto-generated method stub
		return this.orderDao.findByusername(username);
	}
	
	
}
