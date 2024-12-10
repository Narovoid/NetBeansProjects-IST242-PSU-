package com.IST242Apps;

import java.util.Scanner;

public class FriendlyHello {
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    String name;
    System.out.print("Enter your name: ");
    name = stdIn.nextLine();
    System.out.println("Hello, " + name + "!");
    
    
    }
}
