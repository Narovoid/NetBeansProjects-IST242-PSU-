package com.IST242Apps;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyViewer extends JFrame implements KeyListener{
    
    
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field.");
    
    public KeyViewer(){
        super("KeyViewer");
        setLookAndFeel();
        setSize(350,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //this code is setting up the GUI to allow the program to read the key that is being pressed
        keyText.addKeyListener(this); 
        BorderLayout bord = new BorderLayout();    
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);             
    }
    
    public void keyTyped(KeyEvent input){
        char key = input.getKeyChar();
        keyLabel.setText("You pressed " + key);
    }

    public void keyPressed(KeyEvent txt){
        //do nothing
    }
    public void keyReleased(KeyEvent txt){
        //do nothing
    }
    
    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
        // ignore ex error
        }
    }    
        
    public static void main(String[] args) {
        KeyViewer frame = new KeyViewer();
    }
    
    
}

 
 



    
    
    