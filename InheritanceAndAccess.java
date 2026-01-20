package com.company;

class Super {
    protected void display1() {
        System.out.println("This is a protected method in the superclass.");
    }
}
class Child extends Super{
    protected void display2() {
        System.out.println("This is a protected method in the subclass.");
    }
}
class SubChild extends Child{
    protected void display3(){
        System.out.println("This is a protected method in the sub-subclass.");
    }
}
public class InheritanceAndAccess {
    public static void main(String[] args) {
        SubChild obj = new SubChild();
        obj.display1(); // Accessing protected method from Super class
        obj.display2(); // Accessing protected method from Child class
        obj.display3(); // Accessing protected method from SubChild class
    }
}
