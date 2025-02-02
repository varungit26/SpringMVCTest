package com.ck.rewards.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ck.rewards.dao.LoginDAO;
import com.ck.rewards.entity.User;

/**
 * Test class for LoginService
 * 
 * @author Boot Camp User 14
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {

	@Mock
	private LoginDAO LoginDAO;

	@InjectMocks
	private LoginServiceImpl loginServiceImpl;

	/**
	 * verifyUser test case for pass
	 * 
	 * @throws Exception
	 */
	@Test
	public void verifyUserTestPass() throws Exception {
		LoginDAO loginDAO1 = Mockito.mock(LoginDAO.class);
		User user = new User();
		user.setFirstName("xyz");
		when(loginDAO1.verifyUser(user)).thenReturn(true);
		assertEquals(true, loginServiceImpl.verifyUser(user));

	}

	/**
	 * verifyUser test case for fail
	 * 
	 * @throws Exception
	 */
	@Test
	public void verifyUserTestFail() throws Exception {
		User user = new User();
		user.setFirstName("xyz");
		when(LoginDAO.verifyUser(user)).thenReturn(false);
		assertEquals(false, loginServiceImpl.verifyUser(user));

	}
}
