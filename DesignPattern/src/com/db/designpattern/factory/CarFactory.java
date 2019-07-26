package com.db.designpattern.factory;

public class CarFactory {
	public static Car buildCar(CarType model){
		Car car = null;
		
		/*switch(model){
		case SMALL:
			car = new SmallCar(model);
			break;
			
		case SEDAN:
			car = new SedanCar(model);
			break;
			
		case LUXURY:
			car = new LuxuryCar(model);
			break;
		
		default:
			break;
		}*/
		
		//Take location input
		
		Location location = Location.INDIA;
		
		switch (location) {

		case INDIA:
			car = IndiaCarFactory.buildCar(model);
			break;
		
		case UK:
			car = UKCarFactory.buildCar(model);
			break;
			
		case US:
			car = USCarFactory.buildCar(model);
			break;
			
		case DEFAULT:
			car = DefaultCarFactory.buildCar(model);
			break;
			
		default:
			break;
		}
		return car;
	}
}