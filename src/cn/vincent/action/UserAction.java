package cn.vincent.action;

import java.util.List;


import com.opensymphony.xwork2.Action;

import cn.vincent.service.UserService;
import cn.vincent.vo.User;


public class UserAction {

	private List<User> list;
	private UserService userService;
	
	public String list(){
		list = userService.findAll();
		return Action.SUCCESS;
	}
	
	
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
}
