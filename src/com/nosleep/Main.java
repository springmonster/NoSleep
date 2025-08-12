package com.nosleep;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                try {
                    Robot robot = new Robot();
//                    robot.keyPress(KeyEvent.VK_2);
//                    robot.keyRelease(KeyEvent.VK_2);
//                    robot.keyPress(KeyEvent.VK_1);
//                    robot.keyRelease(KeyEvent.VK_1);
//                    robot.keyPress(KeyEvent.VK_SPACE);
//                    robot.keyRelease(KeyEvent.VK_SPACE);
                    robot.mouseMove(getMouseX() + 1, getMouseY() + 1);
                    robot.mouseMove(getMouseX() - 1, getMouseY() - 1);
                    Thread.sleep(10 * 1000);
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
