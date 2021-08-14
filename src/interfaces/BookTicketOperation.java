package interfaces;

import classes.BookedTicket;

public interface BookTicketOperation {
	public void bookingTicket(BookedTicket c);
	public BookedTicket searchBookTicketBYId(int id);
	public void removeBookingTicket(BookedTicket bookedTicket);
}
