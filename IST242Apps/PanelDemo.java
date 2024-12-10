package com.IST242Apps;
        
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDemo extends JFrame implements ActionListener {
    // Constants for the width and height of the frame
    public static final int WIDTH = 300;
    public static final int HEIGHT = 600;

    // Panel components for displaying colors
    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;
    private JPanel greenPanel;

    // Main method to create and show the frame
    public static void main(String[] args) {
        PanelDemo gui = new PanelDemo();
        gui.setVisible(true);
    }

    // Constructor to set up the GUI
    public PanelDemo() {
        // Set the basic GUI parameters
        super("Panel Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a bigger panel to hold the four color panels
        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new BoxLayout(biggerPanel, BoxLayout.Y_AXIS));

        // Create the red panel and add it to the bigger panel
        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(redPanel);

        // Create the white panel and add it to the bigger panel
        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(whitePanel);

        // Create the blue panel and add it to the bigger panel
        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(bluePanel);

        //Create the green panel and add it to the bigger panel
        greenPanel = new JPanel();
        greenPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(greenPanel);

        // Add the bigger panel to the center of the frame
        add(biggerPanel, BorderLayout.CENTER);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());

        // Create the red button and add it to the button panel
        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        // Create the white button and add it to the button panel
        JButton whiteButton = new JButton("White");
        whiteButton.setBackground(Color.WHITE);
        whiteButton.addActionListener(this);
        buttonPanel.add(whiteButton);

        // Create the blue button and add it to the button panel
        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);

        // Create the green button and add it to the button panel
        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.GREEN);
        greenButton.addActionListener(this);
        buttonPanel.add(greenButton);

        // Add the button panel to the top of the frame
        add(buttonPanel, BorderLayout.NORTH);
    }

    // ActionListener method to change the color panels when a button is pressed
    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        if (buttonString.equals("Red"))
            redPanel.setBackground(Color.RED);
        else if (buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if (buttonString.equals("Blue"))
            bluePanel.setBackground(Color.BLUE);
        else if (buttonString.equals("Green"))
            greenPanel.setBackground(Color.GREEN);
        else
            System.out.println("Unexpected error.");
    }
}
