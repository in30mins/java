package com.in30mins;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("Main method invocation started");
        Car car1 = new Car();
        Car car2 = new Car("Camry", "Black", 200);
        System.out.println(Car.noOfEngines);
    }
    static {
        System.out.println("static block from the same class");
    }
}
