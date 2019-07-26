package com.db.designpattern.factory;

public class IndiaCarFactory {
	public static Car buildCar(CarType model){
		Car car = null;
		
		switch (model) {
		case SMALL:
			car = new SmallCar(Location.INDIA);
			break;
			
		case SEDAN:
			car = new SedanCar(Location.INDIA);
			break;
			
		case LUXURY:
			car = new LuxuryCar(Location.INDIA);
			break;
		
		default:
			break;
		}
		return car;
	}
}
