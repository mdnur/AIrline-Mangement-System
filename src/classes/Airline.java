package classes;

public class Airline {
	private int id;
	private String name;
	private int numberOfSeat;
	private int numberOfSeatbooked;
	public Airline() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public int getNumberOfSeatbooked() {
		return numberOfSeatbooked;
	}

	public void setNumberOfSeatbooked(int numberOfSeatbooked) {
		this.numberOfSeatbooked = numberOfSeatbooked;
	}

}
