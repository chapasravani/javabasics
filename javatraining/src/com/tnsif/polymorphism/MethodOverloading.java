package com.tnsif.polymorphism;
class Greeting {
    // Method with one parameter
    void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    // Method with two parameters
    void sayHello(String name1, String name2) {
        System.out.println("Hello, " + name1 + " and " + name2);
    }

    // Method with group
    void sayHello() {
        System.out.println("Hello, everyone");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Greeting g = new Greeting();

        g.sayHello("Krish");
        g.sayHello("Krish", "Sita");
        g.sayHello();
    }
}

