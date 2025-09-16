package com.tnsif.Hybrid;

public class HybridInheritance {
	
	    public static void main(String[] args) {
	      
	        Vehicle v = new Vehicle();
	        v.start();
	        System.out.println();

	    
	        Car c = new Car();
	        c.start();                                   // Car object
	        c.fuelType();
	        System.out.println();

	     
	        Bike b = new Bike();
	        b.start();
	        b.fuelType();                                    // Bike object
	        System.out.println();

	       
	        ElectricCar ec = new ElectricCar();
	        ec.start();                                        // Electric Car object
	        ec.fuelType();
	        ec.charge();
	    }
	}




