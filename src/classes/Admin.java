package classes;

import java.util.Date;

import abstracts.User;

public class Admin extends User {
	protected String role = "admin";

	public Admin(int id, String name, String email, String password, String mobile, String gender, Date dob,
			String address) {
		super(id, name, email, password, mobile, gender, dob, address);
	}
	public Admin(){	
		
	}
	public String getRole() {
		return role;
	}
}
