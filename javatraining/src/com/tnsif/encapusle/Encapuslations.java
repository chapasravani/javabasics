package com.tnsif.encapusle;

public class Encapuslations {

	public static void main(String[] args) {
		Encapse ob=new Encapse();
		System.out.println(ob.color);
		System.out.println(ob.company);
		System.out.println(ob.seats);
		
		ob.start();
		ob.stop();
	}

}
