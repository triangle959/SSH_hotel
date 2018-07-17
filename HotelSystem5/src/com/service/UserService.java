package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {

	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void delUser(int id);

	public User findById(User user);
	
	public User findByUsername(User user);
	
	public List<User> listUsers(int offset,int pagesize);
	
	public void updatePassword(User user);
	
	public User login(User user);
	
	public String updatePassword(User user,String password,String newpassword);
	
	public int getCount();

}
