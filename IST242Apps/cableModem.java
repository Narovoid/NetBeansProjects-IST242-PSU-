package com.IST242Apps;

public class cableModem extends modem {
      String method = "cable connection";
      
      public void connect(){
          System.out.println("Connecting to the internet . . . ");
          System.out.println("Using a " + method);
      }
}
