package com.IST242apps;

import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    
    public Crisis() {
        super("Crisis in Group-Layout");
        setLookAndFeel();
        setSize(348,128);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GroupLayout(getContentPane()));
        panicButton = new JButton("Panic");
        dontPanicButton = new JButton("Don't Panic");
        blameButton = new JButton("Blame others");
        mediaButton = new JButton("notify the media");
        saveButton = new JButton("Save yourself");
        
        // Set the button backgrounds to blue
        panicButton.setBackground(Color.BLUE);
        dontPanicButton.setBackground(Color.BLUE);
        blameButton.setBackground(Color.BLUE);
        mediaButton.setBackground(Color.BLUE);
        saveButton.setBackground(Color.BLUE);
        
         // Add the buttons to the layout
        GroupLayout layout = (GroupLayout) getContentPane().getLayout();
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(panicButton)
                                .addComponent(blameButton)
                                .addComponent(saveButton))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(dontPanicButton)
                                .addComponent(mediaButton))
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(panicButton)
                                .addComponent(dontPanicButton))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(blameButton)
                                .addComponent(mediaButton)
                                .addComponent(saveButton))
        );

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.jva.swing.plaf.numbus.Nimbus-LookAndFeel");
        } catch (Exception exc) {
            //ignore error
        }
    }
    public static void main(String[] args) {
        Crisis frame = new Crisis();
    }
}