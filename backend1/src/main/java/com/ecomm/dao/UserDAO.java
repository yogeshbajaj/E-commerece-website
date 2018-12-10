package com.ecomm.dao;

import com.ecomm.model.User;
public interface UserDAO 
{
	public boolean registerUser(User userDetail);
	public boolean updateUser(User userDetail);
	public User getUser(int Userid);

}
