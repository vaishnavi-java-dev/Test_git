package model;

public class Booking {
	
	private int bookingID;
	private int carID;
	private int customerID;
	private int bookingDate;
	
	//non-parametrized consturctor
	public Booking() {
		
	}
	//parametrized constructor
	public Booking(int bookingID,int carID,int customerID,int booikngDate) {
		
		this.bookingID=bookingID;
		this.carID=carID;
		this.customerID=customerID;
		this.bookingDate=bookingDate;
	}
	
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID=bookingID;
	}
	
	public int getCarID() {
		return carID;
	}
	
	public void setCarID(int carID) {
		this.carID=carID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID=customerID;
	}
	public int getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(int bookingDate) {
		this.bookingDate=bookingDate;
	}
	public String toString() {
		
		return "Booking ID = " + bookingID + "Car ID = " + carID + "Customer ID = " + customerID + " Booking Date = " + bookingDate;
	}
}
