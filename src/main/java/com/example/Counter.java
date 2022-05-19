package com.example;

public class Counter {
    private int number;

    public Counter(int startValue) {
        this.number = startValue;
    }
    public Counter() {
        this.number = 0;
    }
    public int value() {
        return number;
    }
    public void increase() {
        this.number += 1;
    }
    public void decrease() {
        this.number -= 1;
    }
    public void increaseBy(int increase) {
        if (increase < 0) {
            this.number += 0;
        }
        this.number += increase;
    }
    public void decreaseBy(int decrease) {
        if (decrease < 0) {
            this.number += 0;
        }
        this.number -= decrease;
    }
    public String toString() {
        return "The number = " +number;
    }
}
