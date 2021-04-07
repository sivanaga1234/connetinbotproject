package com.user.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="login_details")
public class LoginDetails {
	
	@Id
	@Column(name = "loginID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loginID;
	
	@Size(min = 3, max = 20, message = "Please enter between {min} and {max} characters.")
	@Column(name = "userName", length = 20)
	private String userName;
	
	@Size(min = 4, max = 12, message = "Please enter between {min} and {max} characters.")
	@Column(name = "password", length = 12)
	private String password;
	
	@Column(name = "type", length = 6)
	private String type;
	
	@Column(name = "activeStatus", length = 1)
	private String activeStatus;

	public Integer getLoginID() {
		return loginID;
	}

	public void setLoginID(Integer loginID) {
		this.loginID = loginID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Override
	public String toString() {
		return "LoginDetails [loginID=" + loginID + ", userName=" + userName + ", password=" + password + ", type="
				+ type + ", activeStatus=" + activeStatus + "]";
	}

}
