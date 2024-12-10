package com.IST242Apps;

public class dslmodem extends modem {
        String method = "DSL phone connection";
        
        public void connect(){
            System.out.println("Connecting to the Internet . . .");
            System.out.println("Using a " + method);
        }
}
