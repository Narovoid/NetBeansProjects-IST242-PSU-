package com.IST242Apps;

import java.awt.Color;
import javax.swing.JFrame;

public class Shapes2 {

   public static void main(String[] args) {
      JFrame frame = new JFrame("Drawing 2D Shapes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Shapes2JPanel shapes2JPanel = new Shapes2JPanel();
      frame.add(shapes2JPanel);
      frame.getContentPane().setBackground(Color.WHITE); // Use getContentPane() to set the background color of the content pane
      frame.setSize(400, 400);
      frame.setVisible(true);
   }
}
