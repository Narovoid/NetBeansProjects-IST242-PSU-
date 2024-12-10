package com.IST242Apps;

import javax.swing.*;
import java.awt.*;

public class SalutonFrame extends JFrame {
    private static final Color[] COLORS = {Color.BLUE, Color.GREEN, Color.RED, null};
    private static final String[] TITLES = {"Saluton Mondo Blue", "Saluton Mondo Green", "Saluton Mondo Red", "Saluton Mondo"};
    private static final int DELAY_MS = 5000;
    
    public SalutonFrame () {
        super ("Salutation Mondo!");
        setLookAndFeel();
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Start the color change loop in a separate thread
        new Thread(() -> {
            try {
                for (int i = 0; i < COLORS.length; i++) {
                    if (COLORS[i] == null) {
                        getContentPane().setBackground(null);
                    } else {
                        getContentPane().setBackground(COLORS[i]);
                    }
                    setTitle(TITLES[i]);
                    Thread.sleep(DELAY_MS);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void setLookAndFeel () {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            // ignore error
        }
    }

    public static void main (String[] args) {
        SalutonFrame frame = new SalutonFrame();
    }
}
