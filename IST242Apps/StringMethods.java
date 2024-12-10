package com.IST242Apps;
        
// This program will demonstrate a few of the string methods
        
public class StringMethods {
    
    public static void main(String[] arguments){
        String message = "Java is Great Fun!";
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        char letter = message.charAt(2);
        int stringSize = message.length();
       
     /** This is a very simple and basic way of writing this, if you'd
      like to see a more advanced way using "/n" please let me know. **/
        
        System.out.println(message);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(letter);
        System.out.println(stringSize);
    }
}
