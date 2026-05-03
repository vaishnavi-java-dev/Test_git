package main;

import java.util.Scanner;
import dao.CarDAO;
import dao.CustomerDAO;
import dao.BookingDAO;

import model.Car;
import model.Customer;
import model.Booking;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		CarDAO carDAO =new CarDAO();
		CustomerDAO customerDAO= new CustomerDAO();
		BookingDAO bookingDAO= new BookingDAO();
		
		while(true) {
		
		System.out.println("Rental car Management System");
		System.out.println("1.Add Car");
		System.out.println("2.Add Customer");
		System.out.println("3.Add Booking");
		System.out.println("4.view cars");
		System.out.println("5.view customer");
		System.out.println("6.view Bookings");
		System.out.println("7.Exit");
		System.out.println("8.Return Car");
		
		int choice= sc.nextInt();
		
		System.out.println("Enter your choice : ");
		if(choice==1) {
			
			System.out.println("Enter car id : ");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter model : ");
			String model=sc.nextLine();
			
			System.out.println("Enter prcie : ");
			double price=sc.nextDouble();
			
			System.out.println("Is availabe(true/false)");
			boolean available=sc.nextBoolean();
			
			Car car= new Car(id,model,price,available);
			carDAO.addCar(car);
			System.out.println("Car added successfully");
		}
		else if(choice==2) {
			System.out.println("Enter customer id :");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter name :");
			String name=sc.nextLine();
			
			System.out.println("Enter phone :");
			String phone=sc.nextLine();
			
			Customer customer = new Customer(id,name,phone);
			customerDAO.addCustomer(customer);
			System.out.println("Customer added successfully");
		}
		else if(choice==3) {
			System.out.println("Enter booking id");
			int bid= sc.nextInt();
			
			System.out.println("Enter car id :");
			int carId= sc.nextInt();
			
			System.out.println("Enter customer id :");
			int customerId = sc.nextInt();
			
			System.out.println("Enter date (yyyymmdd)");
			int date =sc.nextInt();
			
			Booking booking = new Booking(bid,carId,customerId,date);
			//bookingDAO.addBooking(booking);
			//System.out.println("Booking added successfully");
			boolean booked = carDAO.markCarASunavailable(carId);
			if(booked) {
				bookingDAO.addBooking(booking);
				System.out.println("Car booked successfully");
			}
			else {
				System.out.println("Car not available or inavlid car id");
			}
		}
		else if(choice==4) {
			for(Car c : carDAO.getAllCars()) {
				System.out.println(c);
			}
		}
		else if(choice==5) {
			for(Customer c : customerDAO.getAllCustomers()) {
				System.out.println(c);
			}
		}
		else if(choice==6) {
			for(Booking b : bookingDAO.getAllBookings()) {
				System.out.println(b);
			}
		}
		else if(choice==7) {
			System.out.println("Thank you");
			break;
		}
		else if(choice == 8) {
			
			System.out.println("Enter Car ID To Return : ");
			int carId=sc.nextInt();
			
			boolean returned=carDAO.returnCar(carId);
			
			if(returned) {
				System.out.println("Car returned successfully");
			}
			else {
				System.out.println("Inavlid car Id or car was not booked");
			}
		}
		else {
			System.out.println("Invalid choice");
		}
		}
	}

}
