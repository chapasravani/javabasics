package com.tnsif.Hybrid;

public class Vehicle {
	
	
	    void start() {
	        System.out.println("Vehicle is starting...");
	    }
	}

	class Car extends Vehicle {
	    void fuelType() {
	        System.out.println("Car runs on Petrol/Diesel.");
	    }
	}

	class Bike extends Vehicle {
	    void fuelType() {
	        System.out.println("Bike runs on Petrol.");
	    }
	}

	interface Electric {
	    void charge();
	}

	class ElectricCar extends Car implements Electric {
	    public void charge() {
	        System.out.println("Electric Car is charging with battery.");
	    }

	    void fuelType() {
	        System.out.println("Electric Car runs on Battery.");
	    }
	}



