package classes;

import java.util.Date;

import abstracts.Flight;

public class NationalFlight extends Flight {
	private String flightRange = "national";

	public NationalFlight() {
		super();
	}

	public NationalFlight(int no, String from, String to, String time, Date depatureDate, int sit) {
		super(no, from, to, time, depatureDate, sit);
	}

}
