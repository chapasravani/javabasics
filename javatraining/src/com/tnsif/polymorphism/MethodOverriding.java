package com.tnsif.polymorphism;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child classes
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow moos");
    }
}

// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();

        a = new Cow();
        a.makeSound();
    }
}
