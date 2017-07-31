package com.sridurgatraders.main.dao;

import java.util.List;

import com.sridurgatraders.main.dto.User;

public interface LoginDbValidation {

	public boolean validateUser(String name, String password) throws Exception;
	public List<User> getlist(String name);
	public void registerUser(User user);
	public List<User> getAllUserList();
	public void deleteAnUser(String uname);
	public void updateAnUser(User user);
	public User getAnUser(String uname);

}
