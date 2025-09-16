package com.tnsif.multiinheritance;

public class base {

	public void method1()
	{
		System.out.println("This is method1");
	}
}

   class base1 extends base{
	   public void method2()
	   {
		   System.out.println("This is method2");
	   }
   }

   class base2 extends base1{
	   public void method3()
	   {
		   System.out.println("This is method3");
	   }
   }
