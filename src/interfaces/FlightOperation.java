package interfaces;

import abstracts.Flight;

public interface FlightOperation {
	public void insertFlight(Flight flight);

	public void removeFlight(Flight flight);

	public Flight getFlight(int id);

	public void showAllFlights();
}
