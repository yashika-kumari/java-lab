package com.company;

public class Goeduhub {
    int id;
    String name;

    // Default constructor
    Goeduhub(){
        System.out.println("Default constructor called!");
    }

    // Parameterized constructor
    Goeduhub(int i, String n){
        id = i;
        name = n;
        System.out.println("Parameterized constructor called!");
    }

    // Copy constructor
    Goeduhub(Goeduhub g){
        id = g.id;
        name = g.name;
        System.out.println("Copy constructor called!");
    }

    // Method to display values
    void display(){
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args){
        Goeduhub g1 = new Goeduhub();
        g1.display();

        Goeduhub g2 = new Goeduhub(101, "Goeduhub");
        g2.display();

        Goeduhub g3 = new Goeduhub(g2);
        g3.display();
    }
}
