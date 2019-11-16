package io.javabrains.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import io.javabrains.model.User;
import io.javabrains.service.LoginService;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	User user = new User();
	
	public void validate(){
		if(StringUtils.isEmpty(user.getLoginID())) {
			addFieldError("loginID", "Login ID cannot be empty");
		}
		if(StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password", "Password cannot be empty");
		}
	}
	
	public String execute() {
		LoginService loginService = new LoginService();
		if (loginService.validateUser(user)) {
			return SUCCESS;
		} 
		return LOGIN;
	}

	public User getUser() {
		return user;
	}	// TODO Auto-generated method stub

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		return user;
	}
}
