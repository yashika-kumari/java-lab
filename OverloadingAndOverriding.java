package com.company;
class Overloading{
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

}
public class OverloadingAndOverriding extends Overloading {

    int multiply(int a, int b) {
        return a * b + 10;  // Overriding the method
    }
    public static void main(String[] args) {

        Overloading obj1 = new Overloading();
        Overloading obj2 = new OverloadingAndOverriding();

        // Overloading (compile time)
        System.out.println(obj1.multiply(2, 3));        // 6
        System.out.println(obj1.multiply(2, 3, 4));     // 24

        // Overriding (runtime)
        System.out.println(obj2.multiply(2, 3));        // 16
    }

}