package abstracts;

import java.util.Date;

import classes.Airline;

public abstract class Flight {
	private int no;
	private String from;
	private String to;
	private String time;
	private Date departureDate;
	private Airline airline;
	private String flightRange;
	
	public Flight() {
	}

	public Flight(int no, String from, String to, String time, Date departureDate, int sit) {
		this.no = no;
		this.from = from;
		this.to = to;
		this.time = time;
		this.departureDate = departureDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Date getDepatureDate() {
		return departureDate;
	}

	public void setDepatureDate(Date depatureDate) {
		this.departureDate = depatureDate;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public String getFlightRange() {
		return flightRange;
	}

}
