package dao;

import java.util.ArrayList;
import model.Car;

public class CarDAO {
	
	private ArrayList<Car> cars= new ArrayList<>();
	
	public void addCar(Car car) {
		cars.add(car);
		System.out.println("Car aaded inside list");
	}
	
	public ArrayList<Car> getAllCars(){
		return cars;
	}
	public boolean markCarASunavailable(int carID) {
		
		for(Car car : cars) {
			
			if(car.getCardId()== carID && car.getAavilable()) {
				
				car.setAvialable(false);
				return true;
			}
		}
		return false;
		
	}
	public boolean returnCar(int carID) {
		
		for(Car car : cars) {
			
			if(car.getCardId()== carID && !car.getAavilable()) {
				car.setAvialable(true);
				return true;
			}
		}
		return false;
	}

	
}
