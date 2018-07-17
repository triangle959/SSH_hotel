package com.service.impl;

import java.util.List;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userdao) {
		this.userDao = userdao;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateUser(user);
	}

	@Override
	public void delUser(int id) {
		// TODO Auto-generated method stub
		this.userDao.delUser(id);
	}

	public User findById(User user){
		return this.userDao.findById(user);
	}
	
	@Override
	public User findByUsername(User user) {
		// TODO Auto-generated method stub
		return this.userDao.findByUsername(user);
	}

	@Override
	public List<User> listUsers(int offset, int pagesize) {
		// TODO Auto-generated method stub
		return this.userDao.listUsers(offset, pagesize);
	}

	@Override
	public void updatePassword(User user) {
		// TODO Auto-generated method stub
		this.userDao.updatePassword(user);
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		User u = this.findByUsername(user);
		if(u!=null)
		{
			if (user.getPassword().equals(u.getPassword()))
			{
				return u;
			}
		}
		return null;
	}

	@Override
	public String updatePassword(User user, String password, String newpassword) {
		// TODO Auto-generated method stub
		String result = null;
		if (password.equals(user.getPassword()))
		{
			user.setPassword(newpassword);
			this.userDao.updatePassword(user);
			result = "修改成功";
		}
		else
		{
			result = "原密码错误";
		}
		return result;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return userDao.getCount();
	}

}
