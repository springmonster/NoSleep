package com.nosleep;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        new Thread(() -> {
            while (true) {
                try {
                    Robot robot = new Robot();
                    robot.mouseMove(getMouseX() + 1, getMouseY() + 1);
                    robot.mouseMove(getMouseX() - 1, getMouseY() - 1);
                    Thread.sleep(60 * 1000);
                } catch (InterruptedException | AWTException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private static int getMouseX() {
        return (int) MouseInfo.getPointerInfo().getLocation().getX();
    }

    private static int getMouseY() {
        return (int) MouseInfo.getPointerInfo().getLocation().getY();
    }
}
