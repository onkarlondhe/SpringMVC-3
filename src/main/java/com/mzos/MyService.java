package com.mzos;

public class MyService {

	public boolean validate(String user, String pass) {
		if(user.equalsIgnoreCase("mzos") && pass.equals("1234")) 
			return true;
		else
			return false;
	}
}
