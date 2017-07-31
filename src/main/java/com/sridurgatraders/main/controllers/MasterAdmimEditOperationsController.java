package com.sridurgatraders.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MasterAdmimEditOperationsController {

	@RequestMapping(value = "/displayAdminPageHeaderPage")
	public String displayAdminHeaderPage() {

		return "duragTradersAdminPageHeaderPage";
	}
}