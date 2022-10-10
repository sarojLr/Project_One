package com.mvn;


import java.util.ResourceBundle;

public class Login {

	
	public String userLogin(String userID, String pword )
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String uName = rb.getString("username");
		String pass = rb.getString("password");
				
		if(userID.equals(uName) && pword.equals(pass))
			return "valid";
		return "invalid";
	}
}

