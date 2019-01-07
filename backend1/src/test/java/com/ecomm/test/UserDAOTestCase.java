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

	public void registerUserTestCase()
	{
		User user=new User();
		user.setUserId(2);
		user.setUserName("rohan");
		user.setMobileNumber(1234567898);
		user.setUseraddress("pune");
		user.setUserEmailId("rohan@gmail.com");
		user.setUserPass("12345");
		user.setUserrole("admin");
		user.setEnabled(true);
		assertTrue("Problem in Adding User",userDAO.registerUser(user));
	}
	
	
	@Test
	@Ignore
	public void updateUserTest()
	{
		
			User user=userDAO.getUser("yogesh");
			user.setUserName("Yogesh");
			assertTrue("Problem in Updating User",userDAO.updateUser(user));
	}
	
	@Test
	@Ignore
	public void getUserTest()
	{
		
	}
}


