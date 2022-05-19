package com.example;
import java.util.Scanner;

public class Greetings {
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        return name;
    }
    public static void main (String[] args) {
        String boop = getInput();
        System.out.println("Hello " + boop);
}
}
