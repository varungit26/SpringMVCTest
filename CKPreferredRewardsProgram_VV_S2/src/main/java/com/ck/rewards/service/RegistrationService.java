package com.ck.rewards.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ck.rewards.dao.RegisterDAO;
import com.ck.rewards.dao.StoreDAO;
import com.ck.rewards.entity.Address;
import com.ck.rewards.entity.Profile;
import com.ck.rewards.entity.Store;
import com.ck.rewards.entity.User;
import com.google.gson.JsonArray;

/**
 * Registration Service class
 *
 */
@Service
public class RegistrationService {

	@Autowired
	RegisterDAO registerDao;

	@Autowired
	StoreDAO storeDao;

	/**
	 * Calls DAO classes to load Member registration data in Database
	 * 
	 * @param address
	 * @param profile
	 * @param user
	 * @return
	 */

	public boolean registerUser(User user, Address address, Profile profile) {

		boolean status = false;

		try {
			// Set User details first as it is foreign keys
			status = registerDao.registerUser(user, address, profile);
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;

	}

	/**
	 * To check whether Username already exist or not.
	 * 
	 * @param userName
	 * @return
	 */
	public boolean checkUserExist(User user) {

		boolean isUserExist = true;

		try {
			isUserExist = registerDao.checkUserExist(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isUserExist;
	}

	/**
	 * Returns List of stores based on country and state
	 * 
	 * @param state
	 * @param country
	 * @return
	 */
	public HashMap<String, String> getStores(String state) {

		List<Store> storeList = new ArrayList<Store>();

		try {
			storeList = storeDao.getStores(state);
		} catch (Exception e) {
			e.printStackTrace();
		}

		HashMap<String, String> storesList = new HashMap<>();
		for (Store str : storeList) {
			storesList.put(Integer.toString(str.getStoreID()), str.getName() + "," + str.getAddressLine1() + ","
					+ str.getAddressLine2() + "," + str.getCity() + "," + str.getZip());
		}

		return storesList;
	}

	public String getUsersInfo() {

		/*List<User> userList = new ArrayList();

		try {
			userList = (List<User>) registerDao.getUsersList();
		} catch (Exception e) {
			e.printStackTrace();

		}

		User user = userList.get(0);
		System.err.println(user.getFirstName());*/

		JsonArray json = new JsonArray();

		/*for (int i = 0; i < userList.size(); i++) {
			User user1 = userList.get(i);
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("firstName", user1.getFirstName());
			jsonObj.put("lastName", user1.getLastName());
			json.add(jsonObj);
		}*/
		return json.toString();
	}
}
