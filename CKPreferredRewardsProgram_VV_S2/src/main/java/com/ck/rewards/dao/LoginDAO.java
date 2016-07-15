package com.ck.rewards.dao;

import com.ck.rewards.entity.User;

/**
 * Login DAO Interface
 * @author Boot Camp User 14
 *
 */
public interface LoginDAO {

	/**
	 * Verify User Method Signature
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean verifyUser(User user) throws Exception ;
}
