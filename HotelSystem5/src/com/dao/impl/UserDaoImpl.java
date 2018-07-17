package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.UserDao;
import com.entity.User;

public class UserDaoImpl implements UserDao{
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(user);
	}

	@Override
	public void delUser(int id) {
		// TODO Auto-generated method stub
		User user = this.hibernateTemplate.get(User.class, id);
		this.hibernateTemplate.delete(user);
	}

	@Override
	public User findById(User user) {
		// TODO Auto-generated method stub
		String hql = "from User as u where u.id=" + user.getUserId();
		List list = this.hibernateTemplate.find(hql);
		User user2 =(User)list.get(0);
		return user2;
	}

	@Override
	public User findByUsername(User user) {
		// TODO Auto-generated method stub
		String hql = "from User as u where u.username='" + user.getUsername()+"'";
		List list = this.hibernateTemplate.find(hql);
		User user3 =(User)list.get(0) ;
		return user3;
	}

	@Override
	public List<User> listUsers(int offset, int pagesize) {
		// TODO Auto-generated method stub
		String hql = "from User";
		Session session = this.hibernateTemplate.getSessionFactory().openSession();
		List<User> users = session.createQuery(hql).setFirstResult(offset).setMaxResults(pagesize).list();
		return users;
	}

	@Override
	public void updatePassword(User user) {
		// TODO Auto-generated method stub
		user.setPassword((user.getPassword()));
		this.hibernateTemplate.update(user);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from User";
		List list = this.hibernateTemplate.find(hql);
        int count = ((Long) list.get(0)).intValue();
		return count;
	}

}
