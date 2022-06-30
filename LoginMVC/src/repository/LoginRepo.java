package repository;

import model.LoginFields;

public class LoginRepo {

	public String verifyPassword(LoginFields obj) {
		if(obj.getPassword()==1234) {
			return "Correct Password\n Welcome !!";
		}
		else 
			return "wrong Password";
	}
}
