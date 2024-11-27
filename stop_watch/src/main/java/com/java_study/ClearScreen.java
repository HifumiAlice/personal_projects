package com.java_study;

public class ClearScreen {

    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            System.out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
