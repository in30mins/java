package com.in30mins;

class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound ...");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks ..");
    }
}
public class Quiz1 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
    }
}
