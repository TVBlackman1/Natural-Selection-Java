package com.company.present;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame implements Runnable {
    int i = 0;
    final int DELAY = 25;
    public Form() {
        super("Natural Selection");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr2d = (Graphics2D) g;
//        gr2d.setBackground(Color.LIGHT_GRAY);
        gr2d.setBackground(Color.RED);
        gr2d.setPaint(Color.BLACK);
        gr2d.drawLine(100 + i++, 100, 200, 200);
    }

    @Override
    public void run() {
//        while(true) {
//            this.repaint();
////            this.paintComponents();
//        }

        long beforeTime, timeDiff, sleep;

        beforeTime = System.currentTimeMillis();

        while (true) {
            repaint();

            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = DELAY - timeDiff;

            if (sleep < 0) {
                sleep = 2;
            }

            sleep = 50;

            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {

                String msg = String.format("Thread interrupted: %s", e.getMessage());

                JOptionPane.showMessageDialog(this, msg, "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            beforeTime = System.currentTimeMillis();
        }
    }
}
