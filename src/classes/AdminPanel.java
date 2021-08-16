package classes;

import java.util.Date;

import java.text.SimpleDateFormat;
import abstracts.Flight;
import abstracts.User;
import interfaces.AirlineOperation;
import interfaces.BookTicketOperation;
import interfaces.CustomerOperation;
import interfaces.FlightOperation;

public class AdminPanel implements CustomerOperation, AirlineOperation, FlightOperation,BookTicketOperation {
	public static SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
	User customers[] = new User[100];
	Airline airlines[] = new Airline[100];
	Flight flights[] = new Flight[100];
	BookedTicket[] bookedTickets = new BookedTicket[100];

	@Override
	public void insertFlight(Flight flight) {
		int flag = 0;
		for (int i = 0; i < flights.length; i++) {
			if (flights[i] == null) {
				flights[i] = flight;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("flight Inserted");
		} else {
			System.out.println("Can Not Insert");
		}

	}

	@Override
	public void removeFlight(Flight flight) {
		int flag = 0;
		for (int i = 0; i < flights.length; i++) {
			if (flights[i] == flight) {
				flights[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("flight Removed");
		} else {
			System.out.println("Can Not Remove");
		}

	}

	@Override
	public Flight getFlight(int id) {
		Flight flight = null;

		for (int i = 0; i < flights.length; i++) {
			if (flights[i] != null) {
				if (flights[i].getNo() == id) {
					flight = flights[i];
					break;
				}
			}
		}
		if (flight != null) {
			System.out.println("Flight Found");
		} else {
			System.out.println("Flight Not Found");
		}
		return flight;
	}

	@Override
	public void showAllFlights() {
		for (Flight c : flights) {
			if (c != null) {
				System.out.println("**********************************");
				System.out.println("Flight No: " + c.getNo());
				System.out.println("Flight From: " + c.getFrom());
				System.out.println("Flight To: " + c.getTo());
				System.out.println("Flight time: " + c.getTime());
				System.out.println("Flight Depature Date: " + sdformat.format(c.getDepatureDate()));
				System.out.println("Flight Flight Range: " + c.getFlightRange());
				System.out.println("Flight Flight Airline Name: " + c.getAirline().getName());
				System.out.println("Flight Fligth Airline seated booked: " + c.getAirline().getNumberOfSeatbooked());
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}

	}
	
	
	public void searchFlightsByRange(String range ) {
		
//		if(countFlightByRange(range) == 0) {
//			Tools.clearPrintHold("No Flights found\n");
//			return;
//		}
		
		for (int i = 0; i < flights.length; i++) {
			if (flights[i] != null) {
				if (flights[i].getFlightRange().equals(range)) {
					System.out.println("**********************************");
					System.out.println("Flight No: " + flights[i].getNo());
					System.out.println("Flight From: " + flights[i].getFrom());
					System.out.println("Flight To: " + flights[i].getTo());
					System.out.println("Flight time: " + flights[i].getTime());
					System.out.println("Flight Depature Date: " + sdformat.format(flights[i].getDepatureDate()));
					System.out.println("Flight Flight Range: " + flights[i].getFlightRange());
					System.out.println("Flight Flight Airline Name: " + flights[i].getAirline().getName());
					System.out.println("Flight Fligth Airline seated booked: " + flights[i].getAirline().getNumberOfSeatbooked());
					System.out.println("----------------------------------");
					System.out.println("----------------------------------");
				}
			}
		}

	}

	@Override
	public void insertAirline(Airline airline) {
		int flag = 0;
		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i] == null) {
				airlines[i] = airline;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("airline Inserted");
		} else {
			System.out.println("Can Not Insert");
		}

	}

	@Override
	public void removeAirline(Airline airline) {
		int flag = 0;
		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i] == airline) {
				airlines[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("airline Removed");
		} else {
			System.out.println("Can Not Remove");
		}

	}

	@Override
	public Airline getAirline(int id) {
		Airline airline = null;

		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i] != null) {
				if (airlines[i].getId() == id) {
					airline = airlines[i];
					break;
				}
			}
		}
		if (airline != null) {
			System.out.println("Airline Found");
		} else {
			System.out.println("Airline Not Found");
		}
		return airline;
	}

	@Override
	public void showAllAirlines() {
		for (Airline c : airlines) {
			if (c != null) {
				System.out.println("**********************************");
				System.out.println("Airline Name: " + c.getName());
				System.out.println("Airline NID: " + c.getId());
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}

	}

	public void insertCustomer(Customer c) {
		int flag = 0;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == null) {
				customers[i] = c;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Customer Inserted");
		} else {
			System.out.println("Can Not Insert");
		}
	}

	public void removeCustomer(User user) {
		int flag = 0;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == user) {
				customers[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Customer Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}

	public void showAllCustomers() {

		
		for (User c : customers) {
			if (c != null) {
				System.out.println("**********************************");
				System.out.println("Customer ID: " + c.getId());
				System.out.println("Customer Name: " + c.getName());
				System.out.println("Customer Email: " + c.getEmail());
				System.out.println("Customer Mobile: " + c.getMobile());
				System.out.println("Customer Gender: " + c.getGender());
				System.out.println("Customer Dob: " + c.getDob());
				System.out.println("Customer Address: " + c.getAddress());
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}
		

		
	}

	public User getCustomer(int id) {
		User c = null;

		for (int i = 0; i < customers.length; i++) {
			if (customers[i] != null) {
				if (customers[i].getId() == id) {
					c = customers[i];
					break;
				}
			}
		}
		if (c == null) {
			System.out.println("Customer Not Found");
		}//  else {
		// 	System.out.println("Customer Not Found");
		// }
		return c;
	}

	public User loginUser(String email, String password) {
			
		User c = null;
		
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] != null) {
				if (customers[i].getEmail().equals(email) && customers[i].getPassword().equals(password)) {
					c = customers[i];
					break;
				}
			}
		}
		if (c != null) {
			LoginSession.setLoginStatus(true);
			LoginSession.setUserID(c.getId());
			if(c.getRole().equals("admin")) {
				LoginSession.setRole(1);
			}else if(c.getRole().equals("user")) {
				LoginSession.setRole(2);
			}
			
			System.out.println("Login successful");
		} else {
			System.out.println("login email or password are wrong");
		}
		return c;
	}

	public void insertAdminData(User admin) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == null) {
				customers[i] = admin;
				break;
			}
		}

		
	}

	@Override
	public void bookingTicket(BookedTicket c) {
		int flag = 0;
		for (int i = 0; i < bookedTickets.length; i++) {
			if (bookedTickets[i] == null) {
				bookedTickets[i] = c;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("bookingTicket successfull");
		} else {
			System.out.println("bookingTicket Not successfull");
		}
		
	}

	@Override
	public BookedTicket searchBookTicketBYId(int id) {
		BookedTicket c = null;

		for (int i = 0; i < bookedTickets.length; i++) {
			if (bookedTickets[i] != null) {
				if (bookedTickets[i].getId() == id) {
					c = bookedTickets[i];
					break;
				}
			}
		}
		if (c != null) {
			System.out.println("Booking ticket Found");
		} else {
			System.out.println("Booking ticket Not Found");
		}
		return c;
		
	}

	@Override
	public void removeBookingTicket(BookedTicket bookedTicket) {
		int flag = 0;
		for (int i = 0; i < bookedTickets.length; i++) {
			if (bookedTickets[i] == bookedTicket) {
				bookedTickets[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("booking ticket Removed");
		} else {
			System.out.println("booking ticket Not Remove");
		}
	}

	
	public int countFlightByRange(String range) {
		int count = 0;
		for(int i = 0; i < flights.length; i++) {
			if(flights[i] != null && flights[i].getFlightRange().equals(range)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public void showAllBookingTicket() {
		for(int i = 0; i < bookedTickets.length; i++) {
			if (bookedTickets[i] != null) {
				
				System.out.println("**********************************");
				System.out.println("Ticket ID : " + bookedTickets[i].getId());
				System.out.println("Customer : " + bookedTickets[i].getCustomer());
				System.out.println("Ticket Price : " + bookedTickets[i].getTicketPrice());
				System.out.println("Payment Status : " + bookedTickets[i].getPaymentStatus());
				System.out.println("Flight Flight Range : " + sdformat.format(bookedTickets[i].getBookedDate()));
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		}
	}
	
	public void getBookingTicketByUserId() {
		for(int i = 0; i < bookedTickets.length; i++) {
			if(bookedTickets[i]!= null ) {
				if(bookedTickets[i].getCustomer().getId() == LoginSession.getUserID()) {
					System.out.println("**********************************");
					System.out.println("Ticket ID : " + bookedTickets[i].getId());
					System.out.println("Customer : " + bookedTickets[i].getCustomer());
					System.out.println("Ticket Price : " + bookedTickets[i].getTicketPrice());
					System.out.println("Payment Status : " + bookedTickets[i].getPaymentStatus());
					System.out.println("Flight Flight Range : " + sdformat.format(bookedTickets[i].getBookedDate()));
					System.out.println("----------------------------------");
					System.out.println("----------------------------------");
				}
			}
		}
	}



}
