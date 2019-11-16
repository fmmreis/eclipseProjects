package io.javabrains.service;

import io.javabrains.model.User;

public class LoginService {
	public boolean validateUser(User user) {
		if (user.getLoginID().equals("fmreis") && user.getPassword().equals("pass")) {
			return true;
		} 
		return false;
	}
}
