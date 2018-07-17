package com.action;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport{

	private String userName;
	private String password;
	private String newPassword;
	private UserService userService;
	
	private String name;
	private String phone;
	private String email;
	private String isVip;
	private User user;
	
	private int offset;
	private int pageSize=15;
	private int currentPage=1;
	private int total;
	private int maxPage;
	
	public String loginUser() throws Exception{
	
		HttpServletRequest request = ServletActionContext.getRequest();
		if(isExist(user)){
			User user2 = userService.login(user);
			if(user2 != null){
				request.getSession().setAttribute("user", user2);
				return "loginSucc";
			}else{
				request.getSession().setAttribute("msg","密码错误！");
				return "loginError";
			}
		}else{
			request.getSession().setAttribute("msg","账号错误！");
			return "msg";
		}
	}
	
	 public String loginOut(){
		 ActionContext.getContext().getSession().remove("user");
		 return "loginOut";
	 }
	
	public String registerUser()throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		user = new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		user.setName(request.getParameter("name"));
		user.setPhone(request.getParameter("mobile"));
		user.setEmail(request.getParameter("email"));
		System.out.println(user.getName());
		if (!isExist(user)) {
			System.out.println(user);
			user = new User(userName, password, name, phone, email);
			userService.addUser(user);
			User user2 = userService.findById(user);
			request.getSession().setAttribute("user", user2);
			return "registerSucc";
			
		}else {
			request.setAttribute("registmsg",  "这个用户名有人了");
			 return "registerFail";
		}
	}
	
	public void CheckUsername() throws Exception{  		
	    HttpServletResponse response = ServletActionContext.getResponse();  
	    User user = new User();
	    user.setUsername(userName);
	    if(this.isExist(user)){  
	        response.getWriter().write("1");  	  
	    }else {    
	        response.getWriter().write("0");           
	    }  
	        response.getWriter().close();  
	}  
	
	public User showUserinfo(){
		HttpServletRequest request = ServletActionContext.getRequest();
		user = (User) request.getSession().getAttribute("user");
		User user2 = userService.findById(user);
		return user2;
	}
	
	public String listUser() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		offset = 0;
		Integer os = null;
		try{
			os = Integer.parseInt(request.getParameter("pager.offset"));
		}catch(Exception e){}
		if(os != null){
			offset = os;
		}
		total = userService.getCount();
		maxPage = total / pageSize;
		if(total % pageSize != 0){
			maxPage = maxPage + 1;
		}
		currentPage = offset / pageSize + 1;
		if(currentPage < 1){
			currentPage = 1;
		}
		if(currentPage > maxPage){
			currentPage = maxPage;
		}
		List<User> users = userService.listUsers(offset, pageSize);
		System.out.println("ddddddddddddd"+users.size());
		return "listuser";
	}
	
	private boolean isExist(User user)
	{
		
		User temp = userService.findByUsername(user);
		if (temp != null){
			return true;
		}else{
			return false;
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
