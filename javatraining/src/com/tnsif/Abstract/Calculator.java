package com.tnsif.Abstract;

       abstract class Shape
       {
    	   
                double area;  

       abstract void calcArea();

            void show() 
         {
             System.out.println("Area = " + area);
         }
            
        }

       
           class Square extends Shape {
               int side;

                       Square(int side)
                       {
                             this.side = side;
                        }

    
                void calcArea() 
                {
                     area = side * side;
                 }
                
                void show()
                {
                    System.out.println("Area of Square = " + area);
                }
         }


           class Rectangle extends Shape 
           {
                   int length, breadth;

                        Rectangle(int l, int b) 
                        {
                             this.length = l;
                             this.breadth = b;
                         }

    
                 void calcArea() 
                 {
                      area = length * breadth;
                  }
                 
                 void show()
                 {
                     System.out.println("Area of Rectangle = " + area);
                 }
           }


public class Calculator {
    public static void main(String[] args) {
      
        Shape s = new Square(5);
        s.calcArea();
        s.show();
        
        Shape r = new Rectangle(4, 6);
        r.calcArea();
        r.show();
    }
}
