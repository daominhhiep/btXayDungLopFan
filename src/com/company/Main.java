package com.company;

public class Main {
    public static void main(String[] args) {
        int SLOW = 1;
        int MEDIUM = 2;
        int FAST = 3;

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        System.out.println("");
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("Blue");
        fan1.setOn(false);
        System.out.println(fan2.toString());
    }
}
