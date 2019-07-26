package com.db.designpattern.singleton;

public class Person {
	private String FirstName;
	private String LastName;
	private String PersonId;
	private String Address;
	private static Person person;
	
	private Person() {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.PersonId = PersonId;
		this.Address = Address;
	}
	
	// Creates only one instance
	// Locks the whole method for multiple threads
	/*public static synchronized Person getInstance() {
		if(person == null){
			person = new Person();
			return person;
		}
		return person;
	}*/
	
	// Locks some block of code for multiple threads
	public static Person getInstance() {
		if(person == null){
			// Following code is accessed only by 1 thread at a time
			synchronized (Person.class){
				if(person == null){
					person = new Person();
					return person;
				}
			}
		}
		return person;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	/*public void setFirstName(String firstName) {
		FirstName = firstName;
	}*/
	
	public String getLastName() {
		return LastName;
	}
	
	/*public void setLastName(String lastName) {
		LastName = lastName;
	}*/
	
	public String getPersonId() {
		return PersonId;
	}
	
	/*public void setPersonId(String personId) {
		PersonId = personId;
	}*/
	
	public String getAddress() {
		return Address;
	}
	
	/*public void setAddress(String address) {
		Address = address;
	}*/
	
}
