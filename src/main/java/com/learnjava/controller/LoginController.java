package com.learnjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learnjava.constants.URLConstants;
import com.learnjava.model.Login;
import com.learnjava.model.User;
import com.learnjava.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	private ModelAndView modelAndView;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		modelAndView = new ModelAndView(URLConstants.LOGIN_PAGE);
		modelAndView.addObject("login", new User());
		return modelAndView;
	}

	@RequestMapping(value = "/processLogin", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute("login") Login login) {
		User user = userService.validateUser(login);
		modelAndView = new ModelAndView(URLConstants.HOME_PAGE);
		return modelAndView;
	}
}
