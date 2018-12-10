package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.UserDAO;
import com.ecomm.model.User;
public class UserDAOTestCase 
{
	@Autowired
	static UserDAO userDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
	}
	
	@Test
	@Ignore
	public void registerUserTestCase()
	{
		User user=new User();
		user.setUserId(1);
		user.setUserName("yogesh");
		user.setMobileNumber(1234567898);
		user.setUseraddress("pune");
		user.setUserEmailId("yogeshbajaj98@gmail.com");
		user.setUserPass("12345");
		user.setUserrole("user");
		assertTrue("Problem in Adding User",userDAO.registerUser(user));
	}
	
	
	@Test
	@Ignore
	public void updateUserTest()
	{
		
			User user=userDAO.getUser(98);
			user.setUserName("Yogesh");
			assertTrue("Problem in Updating User",userDAO.updateUser(user));
	}
	
	@Test
	@Ignore
	public void getUserTest()
	{
		
	}
}


