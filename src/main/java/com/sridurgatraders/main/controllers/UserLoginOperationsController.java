package com.sridurgatraders.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sridurgatraders.main.dto.User;
import com.sridurgatraders.main.services.LoginOperationsService;
import com.sridurgatraders.main.servicesimpl.LoginOperationServiceImpl;

@Configuration
@Import({ LoginOperationServiceImpl.class })
@Controller
public class UserLoginOperationsController {

	@Autowired
	private LoginOperationsService loginOperationsService;

	@RequestMapping(value = "/")
	public String loginPortal() {

		return "index";
	}

	@RequestMapping(value = "/login")
	public String login() {

		return "index";
	}

	@RequestMapping(value = "/loginValidation", method = RequestMethod.POST)
	public ModelAndView loginValidation(@ModelAttribute("user") User user) throws Exception {

		String userType = loginOperationsService.loginValidation(user.getUserName(), user.getPassword());

		/*
		 * if (userType.equals("master")) { ModelAndView masterPage = new
		 * ModelAndView("durgaTradersMasterAdminPage"); return masterPage; }
		 */
		if (userType.equals("user")) {
			ModelAndView userPage = new ModelAndView("durgaTradersUserHomePage");

			return userPage;
		}
		if (userType.equals("admin")) {
			ModelAndView adminPage = new ModelAndView("durgaTradersAdminHomePage");

			return adminPage;
		}

		ModelAndView mv2 = new ModelAndView("index");
		mv2.addObject("msg", "entered username or password is wrong!");
		return mv2;
	}

	@RequestMapping(value = "/createUser")
	public String createAccoutn() {

		return "signUp";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {

		String msg = loginOperationsService.registerUser(user);

		if (msg.equals("procede")) {
			ModelAndView mv = new ModelAndView("durgaTradersAdminViewUsers");
			mv.addObject("userlist", loginOperationsService.getAllUserList());
			return mv;

		}

		ModelAndView mv2 = new ModelAndView("signUp");
		mv2.addObject("msg", msg);
		return mv2;
	}

	@RequestMapping(value = "/viewUsers", method = RequestMethod.GET)
	public ModelAndView viewUsers() {

		ModelAndView mv = new ModelAndView("durgaTradersAdminViewUsers");
		mv.addObject("userlist", loginOperationsService.getAllUserList());
		return mv;
	}

	@RequestMapping(value = "/deleteAnUser/{uname}", method = RequestMethod.GET)
	public ModelAndView deleteAnUser(@PathVariable String uname) {
		loginOperationsService.deletingAnUser(uname);

		ModelAndView mv = new ModelAndView("durgaTradersAdminViewUsers");
		mv.addObject("userlist", loginOperationsService.getAllUserList());
		return mv;
	}

	
	@RequestMapping(value = "/updatedAndDisplayUserList", method = RequestMethod.POST)
	public ModelAndView updateAnUser(@ModelAttribute("updateUser") User user) {
		loginOperationsService.updatingAnUser(user);

		ModelAndView mv = new ModelAndView("durgaTradersAdminViewUsers");
		mv.addObject("userlist", loginOperationsService.getAllUserList());
		return mv;
	}

	@RequestMapping(value = "/upDateAnUser/{uname}", method = RequestMethod.GET)
	public ModelAndView updatingAnUser(@PathVariable String uname) {
		
		User user = loginOperationsService.getAnUser(uname);
		ModelAndView mv = new ModelAndView("durgaTradersAdminUpdateUsers");
		mv.addObject("uname", user.getUserName());
		mv.addObject("email", user.getEmail());
		mv.addObject("phone", user.getPhone());
		mv.addObject("role", user.getRole());
		return mv;
	}

}
