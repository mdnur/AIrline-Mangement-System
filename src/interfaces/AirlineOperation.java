package interfaces;

import classes.Airline;

public interface AirlineOperation {
	public void insertAirline(Airline airline);

	public void removeAirline(Airline airline);

	public Airline getAirline(int id);

	public void showAllAirlines();
}
