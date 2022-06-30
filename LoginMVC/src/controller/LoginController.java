package controller;

import model.LoginFields;
import service.LoginServiceImpl;

public class LoginController {

	public static void main(String[] args) {

		LoginFields obj=new  LoginFields("User1",1234);
		LoginFields obj2=new LoginFields("User2",2345);
		
		LoginServiceImpl l=new LoginServiceImpl();
		l.verify(obj2);
		l.verify(obj);
		
	}

}
