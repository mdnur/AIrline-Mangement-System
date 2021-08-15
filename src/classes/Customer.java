package classes;

import java.util.Date;

import abstracts.User;

public class Customer extends User {
	protected String role = "user";

	public Customer(int id, String name, String email, String password, String mobile, String gender, Date dob,
			String address) {
		super(id, name, email, password, mobile, gender, dob, address);
	}

	public Customer() {
	}
	public String getRole() {
		return role;
	}
}
