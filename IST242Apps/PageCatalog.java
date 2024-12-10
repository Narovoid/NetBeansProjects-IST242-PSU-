package com.IST242Apps;

import java.net.*;

public class PageCatalog {
    public static void main(String[] arguments){
        HomePage[] catalog = new HomePage[9];
        try { 
             catalog[0] = new HomePage("Abraham Lincoln", 
                "http://www.newfile770.com", "science fiction");
            catalog[1] = new HomePage("Thomas Jefferson", 
                "http://burningbird.net", "environment");
            catalog[2] = new HomePage("Grover Cleveland", 
                "http://www.google.com", "programming");
            catalog[3] = new HomePage("Millard Filmore", 
                "http://politicalwire.com", "politics");
            catalog[4] = new HomePage("Dwight Eisenhower", 
                "http://www.manton.org");
             catalog[5] = new HomePage("Mark Evanier", 
                "http://www.newsfromme.com", "comic books");
            catalog[6] = new HomePage("Jeff Rient", 
                "http://jrients.blogspot.com", "gaming");
            catalog[7] = new HomePage("Rogers Cadenhead", 
                "https://workbench.cadenhead.org", "movie");
            catalog[8] = new HomePage("Tyller Ferderer", 
                "http://www.juancole.com", "student");
           
        for(int i = 0; i< catalog.length; i++){
                System.out.println(catalog[i].owner + ": " +
                        catalog[i].address + " -- " +
                        catalog[i].category);
            }
                    
        } catch (MalformedURLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
