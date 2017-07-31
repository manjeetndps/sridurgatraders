package com.sridurgatraders.main.services;

import java.util.List;

import com.sridurgatraders.main.dto.User;

public interface LoginOperationsService {
	
	public String loginValidation(String userName, String passWord) throws Exception;
	public String registerUser(User user);
	public List<User> getAllUserList();
	public void deletingAnUser(String uname);
	public void updatingAnUser(User user);
	public User getAnUser(String uname);

}
