package com.IST242Apps;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PrimeFinder extends JFrame implements Runnable, 
        ActionListener{
    
    Thread go;
    JLabel howManyLabel;
    JTextField howMany;
    JButton display;
    JTextArea primes;
    
//Method for defining the GUI
    public PrimeFinder(){
        super("Find Prime Numbers");
        setLookAndFeel();
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        setLocationRelativeTo(null);
        
        howManyLabel= new JLabel("Quantity: ");
        howMany = new JTextField("400", 10);
        display = new JButton("Display Primes");
        primes = new JTextArea(8,40);
        
        
        display.addActionListener(this);
        JPanel topPanel = new JPanel();
        topPanel.add(howManyLabel);
        topPanel.add(howMany);
        topPanel.add(display);
        add(topPanel, BorderLayout.NORTH);
        
        primes.setLineWrap(true);
        JScrollPane textPane = new JScrollPane(primes);
        add(textPane, BorderLayout.CENTER);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent event){
        display.setEnabled(false);
        if(go == null){
            go = new Thread(this);
            go.start();
        }
    }
    
    public void run(){
      int quantity = Integer.parseInt(howMany.getText());
      int numPrimes = 0;
      //candidate: the nuber that might be prime
      int candidate = 2;
      
      primes.append("First " + quantity + " primes:");
      while(numPrimes < quantity){
          if(isPrime(candidate)){
              primes.append(candidate + " ");
              numPrimes++;
          }
          candidate++;
      }
   
    }
    //Checks number if prime
    public static boolean isPrime(int checkNumber){
        double root = Math.sqrt(checkNumber);
        for(int i = 2; i < root; i++){
            if (checkNumber % i == 0){
                return false;
            }
        }
        return true;
    }
    
    //Sets the way the GUI looks and behaves
        private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            // ignore ex error
        }
    }
        
        
    public static void main(String[] arguments) {
            new PrimeFinder();
    }
  
        
        
    
}
