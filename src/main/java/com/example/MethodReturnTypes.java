package com.example;



public class MethodReturnTypes {
    public static void main(String[] args) {
        String word = words();
        System.out.println(word);
        double num = returnNumber();
        System.out.println(num);
        boolean oop = trueFalse();
        System.out.println(oop);
    }
    public static String words() {
        return "Matt, here you go. Hope you enjoyed Picante. It was nice seeing you have some fun.";    }
    public static int returnNumber() {
        return 69;
    }
    public static boolean trueFalse() {
        return false;
    }
}