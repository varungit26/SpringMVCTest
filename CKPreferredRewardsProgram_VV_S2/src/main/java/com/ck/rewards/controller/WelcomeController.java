package com.ck.rewards.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ck.rewards.entity.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Boot Camp User 14 Welcome Controller to redirect to the Welcome
 *         Screen.
 */
@Controller
public class WelcomeController {

	@RequestMapping(value = { "index" })
	public ModelAndView index() {

		ModelAndView model = new ModelAndView("index");

		return model;
	}

	@RequestMapping(value = { "", "/", "welcome" })
	public ModelAndView welcome() {

		ModelAndView model = new ModelAndView("Welcome");

		return model;
	}

	/**
	 * Redirects to Start Page.
	 * 
	 * @return
	 */
	@RequestMapping("/start")
	public String getStarted() {

		return "Start";
	}

}
