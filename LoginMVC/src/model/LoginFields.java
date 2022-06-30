package model;

public class LoginFields {

		private String name;
		private int password;
		
		public LoginFields(String name,int password) {
			this.name=name;
			this.password=password;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
}
