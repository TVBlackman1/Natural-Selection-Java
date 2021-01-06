package com.company.present;

import javax.swing.*;

public class Form extends JFrame implements Runnable {

    public Form() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
        while(true) {
            this.repaint();
//            this.paintComponents();
        }
    }
}
