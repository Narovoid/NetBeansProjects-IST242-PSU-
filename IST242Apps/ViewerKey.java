package com.IST242Apps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewerKey extends JFrame {

    private JTextField keyText;
    private JLabel keyLabel;

    public ViewerKey(){
        super("ViewerKey");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        keyText = new JTextField(80);
        keyLabel = new JLabel("Press any key in the text field.");

        // Add key listener to the text field
        keyText.addKeyListener(new KeyTypedListener());

        // Set up the layout and add components to the frame
        BorderLayout bord = new BorderLayout();    
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception ex) {
            // ignore ex error
        }
    }

    // Inner class for key typed events
    private class KeyTypedListener implements KeyListener {
        public void keyTyped(KeyEvent input) {
            char key = input.getKeyChar();
            keyLabel.setText("You pressed " + key);
        }
        public void keyPressed(KeyEvent txt) {
            // do nothing
        }
        public void keyReleased(KeyEvent txt) {
            // do nothing
        }
    }

    public static void main(String[] args) {
        ViewerKey frame = new ViewerKey();
    }
}
