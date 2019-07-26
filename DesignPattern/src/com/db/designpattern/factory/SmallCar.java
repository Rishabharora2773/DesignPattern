package com.db.designpattern.factory;

public class SmallCar extends Car {

	public SmallCar(Location location) {
		super(CarType.SMALL,location);
		System.out.println("Small Car Constructor!");
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Small Car Created!");
	}

}
