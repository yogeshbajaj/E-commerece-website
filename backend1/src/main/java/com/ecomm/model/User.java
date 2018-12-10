package com.ecomm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User 
{
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String userPass;
	private String UserEmailId;
	private int mobileNumber;
	private String Useraddress;
	private String Userrole;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserEmailId() {
		return UserEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		UserEmailId = userEmailId;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUseraddress() {
		return Useraddress;
	}
	public void setUseraddress(String useraddress) {
		Useraddress = useraddress;
	}
	public String getUserrole() {
		return Userrole;
	}
	public void setUserrole(String userrole) {
		Userrole = userrole;
	}
	
}
