package dao;

import java.util.ArrayList;
import model.Customer;
public class CustomerDAO {
	
	private ArrayList<Customer> customers = new ArrayList<>();
	public void addCustomer(Customer customer) {
		customers.add(customer);
		System.out.println("Customer added inside List");
	}
	public ArrayList<Customer> getAllCustomers(){
		return customers;
	}	
	//public Customer getCustomerById(int customerId) {	
		//return null;
	//}

}
