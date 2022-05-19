package com.example;

import java.util.Scanner;

public class Superhero {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        heroName();
        heroPower();
        

    }
    public static String heroName() {
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String name = scanner.nextLine();
        return "The super hero is " + name + ".";
    }
    public static String heroPower() {
        System.out.println("What is their superpower?");
        String power = scanner.nextLine();
        return "Their power is " +power;
    }
}
