package com.in30mins;

public class NullDemo {
    public static void main(String[] args) {
        String myString = null;
        Employee employee=null;
        int age = employee.getAge();
        System.gc();
    }
}
