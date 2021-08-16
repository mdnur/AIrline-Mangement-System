package interfaces;

import abstracts.User;
import classes.Customer;

public interface CustomerOperation {
	public void insertCustomer(Customer customer);

	public void removeCustomer(User customer);

	public User getCustomer(int id);

	public void showAllCustomers();
}
