package com.ck.rewards.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ck.rewards.entity.Store;

/**
 * Populates store details
 *
 */
@Repository
public class StoreDAO {

	final static Logger logger = Logger.getLogger(StoreDAO.class);

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Retrieves list of Stores based on state and country.
	 * 
	 * @return
	 * @throws SQLException
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Store> getStores(String state) throws Exception {

		logger.info("Creating a session.");
		Session session = sessionFactory.getCurrentSession();
		logger.info("Session created successfully.");

		List<Store> storesList = new ArrayList<Store>();

		storesList = session.createQuery(" from Store where state = " + state).list();
		if (storesList.size() == 0) {
			logger.info("Retrieving Store Detatils failed. Empty list");
		} else {
			logger.info("Retrieved Store list successfully.");
		}

		return storesList;
	}

}
