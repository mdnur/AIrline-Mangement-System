package classes;

import java.util.Date;

import abstracts.Flight;
import abstracts.User;

public class BookedTicket {
	private int id;
	private Customer customer;
	private Flight flight;
	private double ticketPrice;
	private Date bookedDate;
	private boolean paymentStatus;

	
	
	public BookedTicket() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(User user) {
		this.customer = (Customer) user;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public boolean getPaymentStatus() {
		return paymentStatus;
	}

}
