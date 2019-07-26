package com.db.designpattern.factory;

public abstract class Car {
	private CarType model;
	private Location location;
	
	public Car(CarType model,Location location) {
		this.setModel(model);
		this.setLocation(location);
	}
	
	public void setModel(CarType model){
		this.model = model;
	}
	
	public CarType getModel(){
		return this.model;
	}
	
	public abstract void construct();

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
