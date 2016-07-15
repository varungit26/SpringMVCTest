package com.ck.rewards.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ck.rewards.dao.RegisterDAO;
import com.ck.rewards.entity.Address;
import com.ck.rewards.entity.Profile;
import com.ck.rewards.entity.User;

/**
 * Test class for Registration Service
 * 
 * @author Boot Camp User 14
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class RegistrationServiceTest {

	@Mock
	private RegisterDAO registerDAO;

	@InjectMocks
	private RegistrationService regService;

	/**
	 * checkUserExist test case for pass
	 * 
	 * @throws Exception
	 */
	@Test
	public void checkUserExistTestPass() throws Exception {
		User user = new User();
		user.setFirstName("xyz");
		when(registerDAO.checkUserExist(user)).thenReturn(true);
		assertEquals(true, regService.checkUserExist(user));

	}

	/**
	 * checkUserExist test case for fail
	 * 
	 * @throws Exception
	 */
	@Test
	public void checkUserExistTestFail() throws Exception {
		User user = new User();
		user.setFirstName("xyz");
		when(registerDAO.checkUserExist(user)).thenReturn(false);
		assertEquals(false, regService.checkUserExist(user));

	}

	/**
	 * registerUser test case for fail
	 * 
	 * @throws Exception
	 */
	@Test
	public void registerUserTestFail() throws Exception {

		User user = new User();
		Address address = new Address();
		Profile profile = new Profile();
		when(registerDAO.registerUser(user, address, profile)).thenReturn(false);
		assertEquals(false, registerDAO.registerUser(user, address, profile));

	}

	/**
	 * registerUser test case for pass
	 * 
	 * @throws Exception
	 */
	@Test
	public void registerUserTestPass() throws Exception {

		User user = new User();
		Address address = new Address();
		Profile profile = new Profile();
		when(registerDAO.registerUser(user, address, profile)).thenReturn(true);
		assertEquals(true, registerDAO.registerUser(user, address, profile));

	}
}
