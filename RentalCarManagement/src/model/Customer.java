package model;

public class Customer {

	private int customerID;
	private String name;
	private String phone;
	
	//Non-args constructor  non parametrized constructor
	public Customer() {	
	}
	//parametrized constructor
	public Customer(int customerID,String name,String phoone) {
		this.customerID=customerID;
		this.name=name;
		this.phone=phone;
	}
	
	public int getCustomerID() {	
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID=customerID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String toString() {
		
		return "Customer ID = " + customerID + "Name = " + name + "Phone = " + phone;
	}
	}

