package com.db.designpattern.factory;

public class USCarFactory {
	public static Car buildCar(CarType model){
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar(Location.US);
			break;
			
		case SEDAN:
			car = new SedanCar(Location.US);
			break;
			
		case LUXURY:
			car = new LuxuryCar(Location.US);
			break;
		
		default:
			break;
		}
		return car;
	}
}
