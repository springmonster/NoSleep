package com.nosleep;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                try {
                    Robot robot = new Robot();
//                    robot.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
//                    robot.mouseRelease(MouseEvent.BUTTON3_DOWN_MASK);
//                    Thread.sleep(3000);
//                    robot.keyPress(KeyEvent.VK_2);
//                    robot.keyRelease(KeyEvent.VK_2);
//                    robot.keyPress(KeyEvent.VK_1);
//                    robot.keyRelease(KeyEvent.VK_1);
                    robot.keyPress(KeyEvent.VK_SPACE);
                    robot.keyRelease(KeyEvent.VK_SPACE);
////                    robot.mouseMove(getMouseX() + 1, getMouseY() + 1);
////                    robot.mouseMove(getMouseX() - 1, getMouseY() - 1);

//                    // 创建一个随机数生成器
                    Random random = new Random();
//
//                    // 生成 0 到 60,000 毫秒之间的随机数
                    int randomDelay = random.nextInt(60_000 * 3); // 0 到 59999 毫秒
                    Thread.sleep(randomDelay);
                    System.out.println("Sleeping for " + randomDelay + " milliseconds.");
                } catch (AWTException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
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
