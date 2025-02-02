package com.ck.rewards.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ck.rewards.dao.LoginDAO;
import com.ck.rewards.entity.User;

/**
 * Login Service Implementation class
 *
 */
@Service
public class LoginServiceImpl2 implements LoginService {

	@Autowired
	LoginDAO LoginDAO;

	final static Logger logger = Logger.getLogger(LoginServiceImpl.class);

	/*
	 * Verifies user login credentials.
	 * 
	 * @see
	 * com.ck.rewards.service.LoginService#verifyUser(com.ck.rewards.entity.
	 * User)
	 */
	@Override
	public boolean verifyUser(User user) {

		boolean isValidUser = true;

		try {
			isValidUser = LoginDAO.verifyUser(user);
			logger.info("verifyUser: " + isValidUser);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isValidUser;
	}

}
