package com.ck.rewards.controller;

import java.util.jar.Attributes.Name;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ck.rewards.entity.User;
import com.ck.rewards.service.LoginService;

/**
 * Handles Login Process
 * 
 * @author Boot Camp User 14
 *
 */
@Controller
public class LoginController {

	@Autowired
	@Qualifier("loginServiceImpl2")
	LoginService loginService;

	final static Logger logger = Logger.getLogger(LoginController.class);

	/**
	 * Handles User Login by validating user credentials.
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute User user) {

		String nextPage = null;
		boolean isValidUser = loginService.verifyUser(user);

		if (isValidUser) {
			nextPage = "LoginSuccess";
			logger.info("User verification passed. Redirects to Login Success. ");
		} else {
			nextPage = "LoginFailure";
			logger.info("User verification failed. Redirects to Login Failuer. ");
		}

		ModelAndView model = new ModelAndView(nextPage);
		model.addObject("username", user.getUserName());
		return model;

	}

	/**
	 * Redirects to Login Page
	 * 
	 * @return
	 */
	@RequestMapping("/login")
	public String loginPage() {

		return "Login";
	}
}
