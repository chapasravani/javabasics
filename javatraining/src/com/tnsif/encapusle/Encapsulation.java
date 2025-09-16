package com.tnsif.encapusle;

public class Encapsulation {

	public static void main(String[] args) {
		Encapusle obj = new Encapusle();
		System.out.println(obj.color);
		System.out.println(obj.seats);
		System.out.println(obj.company);
		
        obj.start();
        obj.stop();
	}

}