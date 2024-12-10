package com.IST242Apps;

import java.net.*;
        
public class Catalog {
    // Inner Class
    class HomePage {
        String owner;
        URL address;
        String category = "none";

        public HomePage(String inOwner, String inAddress) throws MalformedURLException {
            owner = inOwner;
            address = new URL(inAddress);
        }

        public HomePage(String inOwner, String inAddress, String inCategory) throws MalformedURLException {
            this(inOwner, inAddress);
            category = inCategory;
        }
    }

    // Named Class
    public Catalog() {
        Catalog.HomePage[] catalog = new Catalog.HomePage[5];
        try {
            catalog[0] = new HomePage("Mark Zuckerberg", "http://www.facebook.com", "social media");
            catalog[1] = new HomePage("Bill Gates", "http://www.microsoft.com", "operating systems");
            catalog[2] = new HomePage("Steve Jobs", "http://www.apple.com", "computer/music");
            catalog[3] = new HomePage("Lee Iacoca", "http://www.ford.com", "automobiles");
            catalog[4] = new HomePage("Watsib", "http://www.ibm.com", "AI");

            for(int i = 0; i < catalog.length; i++) {
                System.out.println(catalog[i].owner+ ": " +catalog[i].address+ " --" +catalog[i].category);
            }
        } catch (MalformedURLException e) {
            System.out.println("Error: " +e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Catalog();
    }
}        

