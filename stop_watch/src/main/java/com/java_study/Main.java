package com.java_study;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        ClearScreen cleanScreen = new ClearScreen();

        while (true) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleanScreen.clearScreen();
            System.out.println("Time >> " + stopWatch.getTime());
        }
    }
}