package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.OrderDao;
import com.entity.Order;

public class OrderDaoImpl implements OrderDao{

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(order);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> listOrders(int offset, int pagesize) {
		// TODO Auto-generated method stub
		String hql = "from Order";
		Session session = this.hibernateTemplate.getSessionFactory().openSession();
		List<Order> orders = session.createQuery(hql).setFirstResult(offset).setMaxResults(pagesize).list();
		return orders;
	}


	@Override
	public void deleteOrder(Order order) {
		this.hibernateTemplate.delete(order);	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> unfinishOrders(int offset, int pagesize) {
		String hql = "from Order as o where o.orderstate="+"已预订";
		Session session = this.hibernateTemplate.getSessionFactory().openSession();
		List<Order> orders = session.createQuery(hql).setFirstResult(offset).setMaxResults(pagesize).list();
		return orders;
	}

	@Override
	public void changeOrderState(Order order,String orderstate) {
		// TODO Auto-generated method stub
		String hql ="from Order as o where o.orderId="+order.getOrderId();
		List list = this.hibernateTemplate.find(hql);
		Order order1 = (Order) list.get(0);
		order1.setOrderstate(orderstate);
		this.hibernateTemplate.update(order1);
	}
	
	@SuppressWarnings("unchecked")
	public List<Order> findByusername(String username){
		String hql = "from Order as o where o.username="+"username";
		Session session = this.hibernateTemplate.getSessionFactory().openSession();
		List<Order> orders = session.createQuery(hql).list();
		return orders;
	}

}
