package classes;

import java.util.Date;

import abstracts.Flight;

public class InternationalFlight extends Flight {
	private String flightRange = "international";
	
	public InternationalFlight() {
		super();
	}

	public InternationalFlight(int no, String from, String to, String time, Date depatureDate, int sit) {
		super(no, from, to, time, depatureDate, sit);
		
	}

}
