package com.in30mins;

public class Quiz2 {
    public static void main(String[] args) {
        try {
            System.out.println("First statement of try block");
            int num = 45/3;
            System.out.println(num);
        }catch (Exception e){
            System.out.println("Gfg caught Exceptiom");
        }finally {
            System.out.println("finaly block");
        }
        System.out.println("Main method");
    }
}
