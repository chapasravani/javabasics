package com.tnsif.constructors;

public class DefaultConstruct {
	DefaultConstruct(){
		System.out.println("This is Defaultconstructor!!");
	}
	public void show() {
		System.out.println("This is method");
	}

	public static void main(String[] args) {
		DefaultConstruct dc=new DefaultConstruct();
		dc.show();
	}

}
