package com.db.designpattern.factory;

public class Main {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}
}
