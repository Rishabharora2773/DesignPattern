package com.db.designpattern.factory;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY,location);
		System.out.println("Luxury Car Constructor!");
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Luxury Car Created!");
	}

	@Override
	public String toString() {
		return "LuxuryCar []";
	}
}
