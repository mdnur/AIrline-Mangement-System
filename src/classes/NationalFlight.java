package classes;

import java.util.Date;

import abstracts.Flight;

public class NationalFlight extends Flight {
	private String flightRange = "national";

	public NationalFlight() {
		super();
	}

	public NationalFlight(int no, String from, String to, String time, Date departureDate, int sit) {
		super(no, from, to, time, departureDate, sit);
	}
	public String getFlightRange(){
		return this.flightRange;
	}
}
