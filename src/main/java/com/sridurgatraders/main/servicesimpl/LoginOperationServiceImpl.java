package com.sridurgatraders.main.servicesimpl;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sridurgatraders.main.dao.LoginDbValidation;
import com.sridurgatraders.main.daoimpl.LoginDbValidationImpl;
import com.sridurgatraders.main.dto.User;
import com.sridurgatraders.main.services.LoginOperationsService;

@Configuration
@Import({ LoginDbValidationImpl.class })
public class LoginOperationServiceImpl implements LoginOperationsService {

	@Autowired
	public LoginDbValidation loginDbValidation;

	@Override
	public String loginValidation(String userName, String passWord) throws Exception {

		List<User> list = loginDbValidation.getlist(userName);

		Iterator<User> itr = list.iterator();
		while (itr.hasNext()) {
			User user = itr.next();

			if (user.getUserName().equals(userName) && user.getPassword().equals(passWord)
					&& user.getRole().equals("master")) {

				return "master";

			}

			if (user.getUserName().equals(userName) && user.getPassword().equals(passWord)
					&& user.getRole().equals("user")) {
				return "user";

			}
			if (user.getUserName().equals(userName) && user.getPassword().equals(passWord)
					&& user.getRole().equals("admin")) {
				return "admin";

			}
		}

		return "unknown";
	}

	@Override
	public String registerUser(User user) {

		if (!Pattern.matches("[789][0-9]{9}", user.getPhone())) {
			return "phone number should have minimum 10 digits and starts with only 7 or 8 or 9";
		}

		if (user.getPassword().length() < 6) {
			return "password should have atleast 6 characters.";
		}

		if (!(Pattern.compile("[^A-Za-z0-9]").matcher(user.getPassword()).find()
				&& user.getPassword().matches(".*[a-zA-Z]+.*") && user.getPassword().matches(".*[0-9]+.*"))) {
			return "please provide the strong password! ex..Xx12@21(one alphabet letterr,one special Character and one digit)";

		}
	

		user.setRole("user");
		loginDbValidation.registerUser(user);
		return "procede";
	}

	@Override
	public List<User> getAllUserList() {
		return loginDbValidation.getAllUserList();		
	}

	@Override
	public void deletingAnUser(String uname) {
		loginDbValidation.deleteAnUser(uname);
		
	}

	@Override
	public void updatingAnUser(User user) {
		User userUpdated=loginDbValidation.getAnUser(user.getUserName());
		userUpdated.setEmail(user.getEmail());
		userUpdated.setPhone(user.getEmail());
		userUpdated.setPhone(user.getPhone());
		userUpdated.setRole(user.getRole());
		loginDbValidation.updateAnUser(userUpdated);
		
	}

	@Override
	public User getAnUser(String uname) {
		return loginDbValidation.getAnUser(uname);
	}

}
