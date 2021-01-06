package com.company.present;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Form extends JFrame implements Runnable {


    private final int w = 700;
    private final int h = 600;

    private BufferedImage buf = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    private BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    private BufferedImage graph = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

    private int frame = 0;
    int i = 0;
    private final int FRAMES_TOTAL = 100000;

    final int DELAY = 25;
    public Form() {
        super("Natural Selection");
        setSize(w, h);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
//        super.paint(g);

        Graphics2D graphics2D = (Graphics2D) g;
        g.clearRect(0, 0, w, h);
        ((Graphics2D) g).setBackground(Color.LIGHT_GRAY);

        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawLine(100 + (i++)/100, 100, 200, 200);
    }

    @Override
    public void run() {
        while(true) {
            this.repaint();
        }

//        long beforeTime, timeDiff, sleep;
//
//        beforeTime = System.currentTimeMillis();
//
//        while (frame < FRAMES_TOTAL) {
//            repaint();
////
////            timeDiff = System.currentTimeMillis() - beforeTime;
////            sleep = DELAY - timeDiff;
////
////            if (sleep < 0) {
////                sleep = 2;
////            }
////
////            sleep = 50;
////
////            try {
////                Thread.sleep(sleep);
////            } catch (InterruptedException e) {
////
////                String msg = String.format("Thread interrupted: %s", e.getMessage());
////
////                JOptionPane.showMessageDialog(this, msg, "Error",
////                        JOptionPane.ERROR_MESSAGE);
////            }
////
////            beforeTime = System.currentTimeMillis();
//        }
    }
}
