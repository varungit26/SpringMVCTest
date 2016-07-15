package com.ck.rewards.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ck.rewards.entity.User;

/**
 * Login Service Interface for login validation
 *
 */
@WebService
public interface LoginService {

	@WebMethod
	public boolean verifyUser(User user);

}
