
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import abstracts.Flight;
import abstracts.User;
import classes.AboutUs;
import classes.Admin;
import classes.AdminPanel;
import classes.Airline;
import classes.BookedTicket;
import classes.Customer;
import classes.InternationalFlight;
import classes.LoginSession;
import classes.NationalFlight;

public class Start {
	public static SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		System.out.println("Welcome to Sample Bank Application");
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		AdminPanel adminpanel = new AdminPanel();
		Admin admin = new Admin(1, "admin", "admin@admin.com", "password", "085655877", "male",
				sdformat.parse("21/03/2002"), "dhaka");
		adminpanel.insertAdminData(admin);

		while (choice) {
			System.out.println("Here are Some Options for You: \n");
			System.out.println("	1. Show flights");
			if (LoginSession.isLoginStatus() != true) {
				System.out.println("	2. Login/ Sign Up");
			}

			if (LoginSession.isLoginStatus() == true && LoginSession.getRole() ==1) {
				System.out.println("	3. Admin control");
			}
			if(LoginSession.isLoginStatus() == true) {
				System.out.println("	4. Booking ticket");
			}else {
				System.out.print(" ");
			}
			
			System.out.println("	5. About us");
			if (LoginSession.isLoginStatus() == true) {
				System.out.println("	6. logout");
			}
			System.out.println("	7. Exit the Application\\n");
			System.out.print("What do you want to do? : ");

			int first = sc.nextInt();

			switch (first) {
			case 1:

				System.out.println("You have selected  Show flights");
				System.out.println("Here are Some Options for You: \n");
				System.out.println("	1. Show Domestic flights");
				System.out.println("	2. Show International flights");
				System.out.println("	3. Go Back\n");
				System.out.print("What do you want to do? : ");
				int second1 = sc.nextInt();

				switch (second1) {
				case 1:
					System.out.println("Show all the domestic flights");
					adminpanel.searchFlightsByRange("national");

					break;

				case 2:

					System.out.println("Show all the domestic flights");
					adminpanel.searchFlightsByRange("international");

					break;

				case 3:

					System.out.println("You have Selected to Go Back");
					break;

				default:

					System.out.println("Invalid Input");
					break;
				}

				break;

			case 2:
				if (LoginSession.isLoginStatus() == true){
					System.out.println("You have already login ,Access deny");
					break;
				}
				System.out.println("You have selected login/Sign Up");

				System.out.println("Here are Some Options for You: \n");
				System.out.println("	1. Login");
				System.out.println("	2. Sign Up");
				System.out.println("	3. Go Back\\n");
				System.out.print("What do you want to do? : ");
				int second2 = sc.nextInt();

				switch (second2) {
				case 1:

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. login As Customer");
					System.out.println("	2. login As Admin");
					System.out.println("	3. Go Back\n");

					System.out.print("What do you want to do? : ");
					int optionForl = sc.nextInt();

					switch (optionForl) {
					case 1:
						System.out.print("Enter you  email: ");
						String email = sc.next();
						System.out.print("Enter you password: ");
						String password = sc.next();

						adminpanel.loginUser(email, password);

						break;

					case 2:

						System.out.print("Enter you  email: ");
						String email1 = sc.next();
						System.out.print("Enter you password: ");
						String password2 = sc.next();

						 adminpanel.loginUser(email1, password2);

						break;

					case 3:

						System.out.println("Going Back . . .");
						break;

					default:

						System.out.println("Invalid Input");
						break;
					}

					break;

				case 2:
					System.out.println("You have selected create Account/Sign Up");

					System.out.print("Enter you id: ");
					int id = sc.nextInt();

					System.out.print("Enter you name: ");
					String name = sc.next();

					System.out.print("Enter you email: ");
					String email = sc.next();

					System.out.print("Enter you passsword: ");
					String password = sc.next();

					System.out.print("Enter you mobiile: ");
					String mobile = sc.next();

					System.out.print("Enter you gender: ");
					String gender = sc.next();

					System.out.print("Enter you DateOfBirth(dd/mm/yyy): ");
					String dob = sc.next();

					System.out.print("Enter you address: ");
					String address = sc.next();

					Customer cus1 = new Customer();

					if (adminpanel.getCustomer(id) == null) {
						cus1.setId(id);
						cus1.setName(name);
						cus1.setEmail(email);
						cus1.setPassword(password);
						cus1.setMobile(mobile);
						cus1.setGender(gender);
						cus1.setAddress(address);
						cus1.setDob(sdformat.parse(dob));
						adminpanel.insertCustomer(cus1);
					} else {
						System.out.println("id is taken");
					}

					break;

				case 3:

					System.out.println("Going Back . . .");
					break;

				default:

					System.out.println("Invalid Input");
					break;
				}

				break;

			case 3:
				if(LoginSession.isLoginStatus() == false){
					System.out.println("Access deny");
					break;
				}
				System.out.println("Admin Controll");
				System.out.println("	1. customer mangement ");
				System.out.println("	2. Flight mangement");
				System.out.println("	3. Airline mangement");
				System.out.println("	4. Go Back\n");
				System.out.print("What do you want to do? : ");
				int third1 = sc.nextInt();

				switch (third1) {
				case 1:

					System.out.println("You have selected customer Management");

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Customer");
					System.out.println("	2. Remove Existing Customer");
					System.out.println("	3. Search Customer by id");
					System.out.println("	4. See all Customer");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second3 = sc.nextInt();

					switch (second3) {
					case 1:

						System.out.print("Enter you id: ");
						int id = sc.nextInt();

						System.out.print("Enter you name: ");
						String name = sc.next();

						System.out.print("Enter you email: ");
						String email = sc.next();

						System.out.print("Enter you passsword: ");
						String password = sc.next();

						System.out.print("Enter you mobiile: ");
						String mobile = sc.next();

						System.out.print("Enter you gender: ");
						String gender = sc.next();

						System.out.print("Enter you DateOfBirth(dd/mm/yyy): ");
						String dob = sc.next();

						System.out.print("Enter you address: ");
						String address = sc.next();

						Customer cus1 = new Customer();

						if (adminpanel.getCustomer(id) == null) {
							cus1.setId(id);
							cus1.setName(name);
							cus1.setEmail(email);
							cus1.setPassword(password);
							cus1.setMobile(mobile);
							cus1.setGender(gender);
							cus1.setDob(sdformat.parse(dob));
							cus1.setAddress(address);
						} else {
							System.out.println("id is taken");
						}

						break;

					case 2:

						System.out.println("You have selected Remove Existing Customer");

						System.out.print("Enter Customer id: ");
						int nid2 = sc.nextInt();

						adminpanel.removeCustomer(adminpanel.getCustomer(nid2));

						break;
					case 3:
						System.out.print("Enter Customer id for searching customer: ");
						int nid3 = sc.nextInt();
						User searchCus = adminpanel.getCustomer(nid3);

						if(searchCus !=null){
							System.out.println("**********************************");
							System.out.println("Customer ID: " + searchCus.getId());
							System.out.println("Customer Name: " + searchCus.getName());
							System.out.println("Customer Email: " + searchCus.getEmail());
							System.out.println("Customer Mobile: " + searchCus.getMobile());
							System.out.println("Customer Gender: " + searchCus.getGender());
							System.out.println("Customer Dob: " + sdformat.format(searchCus.getDob()));
							System.out.println("Customer Address: " + searchCus.getAddress());
							System.out.println("----------------------------------");
							System.out.println("----------------------------------");
						}else{

						}
						adminpanel.showAllCustomers();
						break;

					case 4:
						adminpanel.showAllCustomers();
						break;

					case 5:

						System.out.println("Going Back . . .");
						break;

					default:

						System.out.println("Invalid Input");
						break;
					}

					break;

				case 2:
					System.out.println("You have selected Flight Management");

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Flight");
					System.out.println("	2. Remove Existing Flight");
					System.out.println("	3. Search Flight");
					System.out.println("	4. See all Flight");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second4 = sc.nextInt();

					switch (second4) {
					case 1:

						System.out.print("Enter Flight No: ");
						int no = sc.nextInt();
						sc.nextLine();
						

						System.out.print("Enter Flight From: ");
						String from = sc.nextLine();

						System.out.print("Enter Flight to: ");
						String to = sc.nextLine();

						System.out.print("Enter Flight time: ");
						String time = sc.nextLine();

						System.out.print("Enter Flight departure Date(dd/mm/yyyy): ");
						String depatureDate = sc.nextLine();

						System.out.print("Enter Flight airline id: ");
						int airline = sc.nextInt();

						System.out.print("Enter Flight flightRange(1. national ,2.international): ");
						int flightRange = sc.nextInt();


						Flight flight5 = null;
						if (flightRange == 2) {
							flight5 = new InternationalFlight();
						} else if (flightRange == 1) {
							flight5 = new NationalFlight();
						}
						Airline air = adminpanel.getAirline(airline);

						if (adminpanel.getFlight(no) == null && air != null) {

							flight5.setNo(no);
							flight5.setFrom(from);
							flight5.setTo(to);
							flight5.setDepatureDate(sdformat.parse(depatureDate));
							flight5.setAirline(air);
							flight5.setTime(time);
							adminpanel.insertFlight(flight5);
						} else {
							System.out.println("change you flight , your no is taken");
						}

						break;

					case 2:

						System.out.println("You have selected Remove Existing Flight");

						System.out.print("Enter Flight id: ");
						int Flight1ID = sc.nextInt();

						adminpanel.removeFlight(adminpanel.getFlight(Flight1ID));

						break;

					case 3:
						System.out.print("Enter Flight id: ");
						int Flight1IDs = sc.nextInt();
						Flight singleFlightD = adminpanel.getFlight(Flight1IDs);

						if(singleFlightD != null){
							System.out.println("Flight No: " + singleFlightD.getNo());
							System.out.println("Flight From: " + singleFlightD.getFrom());
							System.out.println("Flight To: " + singleFlightD.getTo());
							System.out.println("Flight time: " + singleFlightD.getTime());
							System.out.println("Flight Departure Date: " + sdformat.format(singleFlightD.getDepatureDate()));
							System.out.println("Flight Flight Range: " + singleFlightD.getFlightRange());
							System.out.println("Flight Flight Airline Name: " + singleFlightD.getAirline().getName());
							System.out.println("Flight Flight Airline seated booked: " + singleFlightD.getAirline().getNumberOfSeatbooked());
						}else{

						}
						break;
					case 4:
						adminpanel.showAllFlights();
						break;

					case 5:

						System.out.println("Going Back . . .");
						break;

					default:

						System.out.println("Invalid Input");
						break;
					}

					break;

				case 3:

					System.out.println("You have selected Airline Management");

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Airline");
					System.out.println("	2. Remove Existing Airline");
					System.out.println("	3. Search Airline");
					System.out.println("	4. See all Airline");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second6 = sc.nextInt();

					switch (second6) {
					case 1:

						System.out.print("Enter Airline id: ");
						int id = sc.nextInt();

						System.out.print("Enter Airline name: ");
						String name = sc.next();

						System.out.print("Enter Airline Number Of seat: ");
						int noOFseat = sc.nextInt();

						if (adminpanel.getAirline(id) == null) {
							Airline airline = new Airline();
							airline.setId(id);
							airline.setName(name);
							airline.setNumberOfSeat(noOFseat);

							adminpanel.insertAirline(airline);
						}

						break;

					case 2:

						System.out.println("You have selected Remove Existing Airline");

						System.out.print("Enter Airline id: ");
						int i3 = sc.nextInt();

						adminpanel.removeAirline(adminpanel.getAirline(i3));

						break;

					case 3:
						System.out.print("Enter Airline id: ");
						int i3s = sc.nextInt();

						Airline airDs = adminpanel.getAirline(i3s);

						if(airDs != null){
							System.out.println("**********************************");
							System.out.println("Airline Name: " + airDs.getName());
							System.out.println("Airline NID: " + airDs.getId());
							System.out.println("----------------------------------");
							System.out.println("----------------------------------");
						}

						break;
					case 4:
						adminpanel.showAllAirlines();
						break;

					case 5:

						System.out.println("Going Back . . .");
						break;

					default:

						System.out.println("Invalid Input");
						break;
					}

					break;
				case 4:
					System.out.println("Going Back . . .");
					break;
				default:

					System.out.println("Invalid Input");
					break;
				}
				break;

			case 4:
				if(LoginSession.isLoginStatus() == false){
					System.out.println("Access deny");
					break;
				}
				System.out.println("You have selected  Booking Ticket");
				System.out.println("Here are Some Options for You: \n");
				System.out.println("	1. Booking Ticket");
				System.out.println("	2. Remove Ticket");
				System.out.println("	3. Search Ticket");
				System.out.println("	4. Show All Ticket");
				System.out.println("	5. Go Back\n");
				System.out.print("What do you want to do? : ");
				int second9 = sc.nextInt();
				switch (second9) {
				case 1:

					System.out.print("Enter Booking ticket id: ");
					int id = sc.nextInt();

					System.out.print("Enter Booking customer id name: ");
					int cusID = sc.nextInt();

					System.out.print("Enter Booking Flight id name: ");
					int flithID = sc.nextInt();

					System.out.print("Enter Booking ticket Price: ");
					int price = sc.nextInt();

					System.out.print("Enter Booking ticket Date(dd/mm/yyyy): ");
					String date = sc.next();
					adminpanel.getFlight(flithID);
					if (adminpanel.searchBookTicketBYId(id) == null && adminpanel.getCustomer(cusID) != null
							&& adminpanel.getFlight(flithID) != null) {

						BookedTicket booktk = new BookedTicket();
						booktk.setId(id);
						booktk.setCustomer(adminpanel.getCustomer(cusID));
						booktk.setFlight(adminpanel.getFlight(flithID));
						booktk.setTicketPrice(price);
						booktk.setBookedDate(sdformat.parse(date));
					}

					break;

				case 2:
					System.out.print("Enter Booking ticket id: ");
					int id8 = sc.nextInt();

					adminpanel.removeBookingTicket(adminpanel.searchBookTicketBYId(id8));

					break;

				
					
				case 3 :
					System.out.print("Enter Booking ticket id: ");
					int id8s = sc.nextInt();

					BookedTicket bookingTicketData = adminpanel.searchBookTicketBYId(id8s);
					if (bookingTicketData !=null){
						System.out.println("**********************************");
						System.out.println("Ticket ID : " + bookingTicketData.getId());
						System.out.println("Customer : " + bookingTicketData.getCustomer());
						System.out.println("Ticket Price : " + bookingTicketData.getTicketPrice());
						System.out.println("Payment Status : " + bookingTicketData.getPaymentStatus());
						System.out.println("Flight Flight Range : " + sdformat.format(bookingTicketData.getBookedDate()));
						System.out.println("----------------------------------");
						System.out.println("----------------------------------");
					}else{

					}
					
					break;
				case 4 :
					
					adminpanel.showAllBookingTicket();
					break;
				case 5:

					System.out.println("You have Selected to Go Back");
					break;
				default:

					System.out.println("Invalid Input");
					break;
				}
				break;

			case 5:

				System.out.println("you have selected about us");

				new AboutUs();
				break;

			case 6:
				if (LoginSession.isLoginStatus() == true) {
					LoginSession.setLoginStatus(false);
				}
				break;

			case 7:

				System.out.println("You have selected to exit the application");
				System.out.println("Thank you for using Application");
				choice = false;
				sc.close();
				break;

			default:

				System.out.println("Invalid Input");
				break;
			}
		}

	}

}
