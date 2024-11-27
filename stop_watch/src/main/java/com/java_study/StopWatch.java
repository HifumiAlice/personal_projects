package com.java_study;

public class StopWatch {

    private long startTime;
    private long stopTime;
    private boolean running;

    public StopWatch() {
        running = false;
        start();
    }

    private void start() {
        startTime = System.currentTimeMillis();
        stopTime = System.currentTimeMillis();
        running = true;
    }


    private long getElapsedTime() {
        return stopTime - startTime;
    }

    private void getCurrentTime() {
        stopTime = System.currentTimeMillis();
    }

    public String getTime() {
        getCurrentTime();
        long elapsedTime = getElapsedTime();

        long millis = elapsedTime % 1000;
        long second = elapsedTime / 1000;
        long minute = second / 60;
        second = second % 60;
        long hour = minute / 60;
        minute = minute % 60;

        return String.format("%02d:%02d:%02d:%03d", hour, minute, second,millis);
    }


}
