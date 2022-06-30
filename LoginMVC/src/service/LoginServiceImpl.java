package service;

import model.LoginFields;
import repository.LoginRepo;

public class LoginServiceImpl implements LoginService{

	public void verify(LoginFields obj) {
		
		LoginRepo obj1=new LoginRepo();
		System.out.println(obj1.verifyPassword(obj));
		
		
	}
}
