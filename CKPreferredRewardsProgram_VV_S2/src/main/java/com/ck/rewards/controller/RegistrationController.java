package com.ck.rewards.controller;

import java.util.HashMap;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ck.rewards.entity.Address;
import com.ck.rewards.entity.Profile;
import com.ck.rewards.entity.User;
import com.ck.rewards.service.RegistrationService;
import com.google.gson.Gson;

/**
 * @author Boot Camp User 14 Handles Registration Process
 */
@Controller
public class RegistrationController {

	@Autowired
	RegistrationService regService;

	final static Logger logger = Logger.getLogger(RegistrationController.class);

	/**
	 * Handles User Registration Process by verifying whether username already
	 * exist or not.
	 * 
	 * @param user
	 * @param address
	 * @return
	 */
	@RequestMapping(value = "/newuser_reg", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute @Valid User user, BindingResult bindingResultUser,
			@Valid Address address, BindingResult bindingResultAddress, @Valid Profile profile,
			BindingResult bindingResultProfile, ModelAndView model) {

		String view = null;
		boolean regStatus = false;

		// Checks for the Binding results and proceeds Server side validations.
		if (((!bindingResultUser.hasErrors())) && (!bindingResultAddress.hasErrors())
				&& (!bindingResultProfile.hasErrors())) {

			logger.info("Registration Data Validation is Success.");
			boolean isUsernameExist = regService.checkUserExist(user);

			if (isUsernameExist) {
				logger.warn("UserName already Exist. Please use another username.");
			} else {
				logger.warn("UserName is valid.");
				regStatus = regService.registerUser(user, address, profile);
				System.out.println(regStatus);
			}
		}

		if (regStatus) {
			view = "RegistrationSuccess";
			model.addObject("username", user.getUserName());
		} else {
			model.addObject("errorMessage", "Username already exist. Please choose another Username");
			view = "redirect:registrationPage";
		}

		model.setViewName(view);
		return model;

	}

	/**
	 * Controller to redirect to Registration Page.
	 * 
	 * @return
	 */
	@RequestMapping("/registrationPage")
	public ModelAndView registration() {

		ModelAndView model = new ModelAndView("Registration");

		/*
		 * HashMap<String, String> storesList = new HashMap<>(); storesList =
		 * regService.getStores("1"); model.addObject("storesList", storesList);
		 */

		return model;
	}

	@RequestMapping(value = "/storesInfo")
	@ResponseBody
	public String testing1(@RequestParam String state, Model model) {

		System.out.println("testing location data");
		HashMap<String, String> storesList = new HashMap<>();

		storesList = regService.getStores(state);
		model.addAttribute("storesList", storesList);
		String json = new Gson().toJson(storesList);

		/*
		 * for(String key : storesList.keySet()) { System.out.println(key +
		 * " : " +storesList.get(key)); }
		 */

		return json;
	}

	@RequestMapping(value = "/userInfo")
	@ResponseBody

	public String userInfo(Model model) {

		System.out.println("testing user info in jqGrid");
		/*
		 * HashMap<String, String> usersList = new HashMap<>();
		 * 
		 * usersList = regService.getStores("Texas"); model.addAttribute("list",
		 * usersList); String json = new Gson().toJson(usersList);
		 */

		/*User gridModel1 = new User();
		gridModel1.setFirstName("varun");
		gridModel1.setLastName("vidala");
		gridModel1.setPassword("testJamil");

		User gridModel2 = new User();
		gridModel2.setFirstName("test1");
		gridModel2.setLastName("test2");*/

		
		String json1 = regService.getUsersInfo();
		 
		// List usersInfo = new ArrayList();
		// usersInfo.add(gridModel1);
		// usersInfo.add(gridModel2);
		
		/*- List firstNames = new ArrayList();
		 List lastNames = new ArrayList();
		 for(int i =0;i<usersInfo.size();){
			
			 lastNames.add(usersInfo.get(i++));
		 }
		
		JSONObject jsonObj = new JSONObject();
		
			try {
				jsonObj.put("firstName", firstNames);
				//System.err.println(userIterator.next());
				jsonObj.put("lasttName", lastNames);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(jsonObj);
		json = "{\"page\":1,\"total\":\"2\",\"records\":" + usersInfo.size() + ",\"rows\":" + json + "}";
		*/

	//	Gson gson = new Gson();
	//	String json = gson.toJson(usersInfo);
	//	json = "{\"page\":1,\"total\":\"2\",\"records\":" + usersInfo.size() + ",\"rows\":" + json + "}";

		System.out.println(json1);

		return json1;
	}
}
