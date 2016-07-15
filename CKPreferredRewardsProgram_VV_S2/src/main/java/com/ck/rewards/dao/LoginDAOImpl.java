package com.ck.rewards.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ck.rewards.entity.User;

/**
 * Implements Login DAO Interface
 * @author Boot Camp User 14
 *
 */
@Repository
public class LoginDAOImpl implements LoginDAO {

	final static Logger logger = Logger.getLogger(LoginDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/* Verifies user credentials.
	 * @see com.ck.rewards.dao.LoginDAO#verifyUser(com.ck.rewards.entity.User)
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public boolean verifyUser(User user) throws Exception {

		boolean isUserExist = false;
		
		Session session = sessionFactory.getCurrentSession();
		
		List<String> userList = new ArrayList<String>();
		userList = session.createQuery("from User where username ='" + user.getUserName() + "' and password ='"
				+ user.getPassword() + "'").list();
		if (userList.size() == 0) {
			logger.info("Wrong Username or Password!");
		} else {
			logger.info("UserName exists");
			isUserExist = true;
		}

		return isUserExist;
	}

}
