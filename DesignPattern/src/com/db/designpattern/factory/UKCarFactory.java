package com.db.designpattern.factory;

public class UKCarFactory {
	public static Car buildCar(CarType model){
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar(Location.UK);
			break;
			
		case SEDAN:
			car = new SedanCar(Location.UK);
			break;
			
		case LUXURY:
			car = new LuxuryCar(Location.UK);
			break;
		
		default:
			break;
		}
		return car;
	}
}
