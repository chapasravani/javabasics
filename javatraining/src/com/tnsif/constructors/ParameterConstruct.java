package com.tnsif.constructors;

public class ParameterConstruct {

	ParameterConstruct(int a,int b)
		{
			System.out.println("This is Parameterconstructor!!" );
			System.out.println("Sum of a and b: " + (a + b));
		}
		public void show() {
			System.out.println("This is method");
		}

		public static void main(String[] args) {
			ParameterConstruct dc=new ParameterConstruct(20,30);
			dc.show();
		}

	}



