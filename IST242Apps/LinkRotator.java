package com.IST242Apps;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.net.*;


public class LinkRotator extends JFrame implements Runnable, ActionListener{
       
    String[] pageTitle = new String[9];
    URI[] pageLink = new URI[9];    
    int current = 0;
    Thread runner;
    JLabel siteLabel = new JLabel();
    
    public LinkRotator(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //What does this do?
        setSize(300,100);
        
        FlowLayout flo = new FlowLayout(); // what does this do?
        setLayout(flo);
        
        add(siteLabel);    
    pageTitle = new String[]{
        "Oracle's Java site",
        "Server Side",
        "JavaWorld",
        "Google",
        "Yahoo",
        "Penn State",
        "YouTube",
        "Twitter",
        "Twitch"
        };
    
    pageLink[0] = getURI("http://www.oracle.com/technetwork/");
    pageLink[1] = getURI("http://www.theserverside.com");
    pageLink[2] = getURI("http://www.javaworld.com");
    pageLink[3] = getURI("http://www.google.com");
    pageLink[4] = getURI("http://yahoo.com");
    pageLink[5] = getURI("http://www.psu.edu");
    pageLink[6] = getURI("http://www.youtube.com");
    pageLink[7] = getURI("http://www.twitter.com");
    pageLink[8] = getURI("http://www.twitch.tv");
    
    Button visitButton = new Button("Visit Site"); //adds a button to the frame allowing the person to visit the link attached.
    visitButton.addActionListener(this);
    add(visitButton);
    
    JButton stopButton = new JButton("Stop");
     stopButton.addActionListener(this);
     add(stopButton);
    
    setVisible(true);
    start();
    }  
    private URI getURI(String urlText){
        URI pageURI = null;
        try{
        pageURI = new URI(urlText);
        }
        catch(URISyntaxException ex)
        {
        }
        return pageURI;
    }
    
    public void start(){
        if(runner == null){
            runner = new Thread(this);
            runner.start();
        }

    }
    
   
   public void stop(){
       if(runner != null){
           runner = new Thread(this);
           runner.stop();
       }
   }
    
    
    @Override
    public void run(){
        Thread thisThread = Thread.currentThread();
        while(runner == thisThread){
            current++;
            if(current > 8){
                current = 0;
            }
            siteLabel.setText(pageTitle[current]);
            repaint();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException exc) {
                //do nothing;
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        Desktop desktop = Desktop.getDesktop();
        if (pageLink[current] != null){
            try{
                desktop.browse(pageLink[current]);
                runner = null;
                System.exit(0);
            } catch(IOException exc){
                //do nothing
            }
        }
    }

    public static void main(String[] arguments) {
         new LinkRotator();  
    }
}
