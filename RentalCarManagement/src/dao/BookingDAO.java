package dao;

import java.util.ArrayList;
import model.Booking;
public class BookingDAO {
	
	private ArrayList<Booking> bookings=new ArrayList<>();
	
	public void addBooking(Booking booking) {
		//JDBC Code
		bookings.add(booking);
		System.out.println("Booking added inside list");
	}
	public ArrayList<Booking> getAllBookings(){
		return bookings;
	}
	
	/*public Booking getBookingById(int bookingID) {
		
		return null;
	}*/

	
}
