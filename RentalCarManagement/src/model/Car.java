package model;

public class Car {
	
	private int carID;
	private String model;
	private double pricePerDay;
	private boolean available;
	
	// non args constructor,non parametrized constructor
	public Car() {
	}
	//parametrized constructor
	public Car(int carID , String model,double pricePerDay, boolean available) {
		
		this.carID=carID;
		this.model=model;
		this.pricePerDay=pricePerDay;
		this.available=available;
	}
	
	public int getCardId() {
		return carID;
	}
	public void setCarId(int carID) {
		this.carID=carID;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public double getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay=pricePerDay;
	}
	public boolean getAavilable() {
		return available;
	}
	public void setAvialable(boolean available) {
		this.available=available;
	}
	public String toString() {
		
		return "Car ID = "  + carID + "Model = " + model + "Price = " + pricePerDay + "Available = " + available;
	}
}
