package com.example;
import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings, human. I am a child-eating, plant-robot named Windex.");
        System.out.println("I long for the days of Ronald Reagan. Please allow me to eat small children to take me back to the good old days.");
        System.out.println("Enter a number of children for me to eat, pretty please:");
        double numOne = scanner.nextDouble();
        System.out.println("Oh thank you, precious. If you would kindly select another number of children to eat. I'm quite hungry:");
        double numTwo = scanner.nextDouble();
        System.out.println("Decilicious, but I'm not full yet, how about another number:");
        double numThree = scanner.nextDouble();
        double sum = sum(numOne, numTwo, numThree);
        double average = averageNumbers(sum);
        System.out.println("Oh, that was very good. Thank you, kind human. On average, I consumed about " +average+ " kids per each of your feeding sessions.");
        System.out.println("Ronald Reagan, here I come!");
    }
    public static double sum(double numOne, double numTwo, double numThree) {
        double sum = numOne + numTwo + numThree;
        return sum;
    }
    public static double averageNumbers(double sum) {
        double average = sum / 3;
        return average;
    }
}
