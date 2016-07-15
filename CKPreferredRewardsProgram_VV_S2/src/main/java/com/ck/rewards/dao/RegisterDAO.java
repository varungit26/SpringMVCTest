package com.ck.rewards.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ck.rewards.entity.Address;
import com.ck.rewards.entity.Profile;
import com.ck.rewards.entity.Store;
import com.ck.rewards.entity.User;

/**
 * Registration DAO to verify login details.
 *
 */

@Repository
public class RegisterDAO {

	/*
	 * @PersistenceContext private EntityManager em;
	 */

	@Autowired
	private SessionFactory sessionFactory;
	final static Logger logger = Logger.getLogger(RegisterDAO.class);

	/**
	 * Verifies whether Username already exist or not.
	 * 
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public boolean checkUserExist(User user) throws SQLException {

		boolean isUserExist = true;
		Session session = sessionFactory.getCurrentSession();
		logger.info("session created.");
		/* Session session = DBManager.getSessionFactory().openSession(); */

		List<String> userList = new ArrayList<String>();
		userList = session.createQuery("from User where username ='" + user.getUserName() + "'").list();
		if (userList.size() != 0) {
			logger.info("UserName already exists");
		} else {
			logger.info("Username is valid.");
			isUserExist = false;
		}
		// session.close();
		return isUserExist;
	}

	@Transactional
	public boolean registerUser(User user, Address address, Profile profile) throws SQLException {

		boolean regStatus = false;

		try {

			Session session = sessionFactory.getCurrentSession();
			logger.info("Creating Session.");

			Store store = user.getStore();
			user.setStore(store);
			session.save(user);
			// session.persist(user);

			// address.setUser(user);
			session.save(address);

			// profile.setUser(user);
			// session.save(profile);

			regStatus = true;

		} catch (Exception e) {
			System.out.println(e);
		}

		return regStatus;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<?> getUsersList() throws Exception {

		logger.info("Creating a session.");
		Session session = sessionFactory.getCurrentSession();
		logger.info("Session created successfully.");

		List<User> usersList = new ArrayList<User>();

		usersList = session.createQuery("  from User ").list();

		if (usersList.size() == 0) {
			logger.info("Retrieving User Details failed. Empty list");
		} else {
			logger.info("Retrieved User list successfully.");
		}

		List usersInfo = new ArrayList();
		for (int i = 0; i < usersList.size(); i++) {
			User user = (User) usersList.get(i);
			//System.out.println(user.getFirstName());
			usersInfo.add(user);
			//usersInfo.add(user.getLastName());
		}

		/*-Iterator<User> userListIte = usersList.iterator();
		StringBuilder userInfoSB = new StringBuilder();
		
		while (userListIte.hasNext()) {
			// System.out.println(userListIte.next());
			System.err.println("Testing the data.1");
			userInfoSB.setLength(0);
			System.err.println("Testing the data.2");
			System.out.println(userListIte.next().getFirstName());
			System.err.println("Testing the data.3");
			userInfoSB = userInfoSB.append("firstName:" + userListIte.next().getFirstName() +
					"lastName:" + userListIte.next().getLastName());
			System.err.println("Testing the data.4");
			usersInfo.add(userInfoSB.toString());
		}
		*/

		/*
		 * User user = (User) session.get(User.class, 1);
		 * System.err.println("testing");
		 * Hibernate.initialize(user.getFirstName());
		 * usersList.add(user);
		 */
		return usersInfo;
	}
}
