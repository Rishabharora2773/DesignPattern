package com.db.designpattern.factory;

public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(CarType.SEDAN,location);
		System.out.println("Sedan Car Constructor!");
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Sedan Car Created!");
	}

}
