package com.IST242apps;

public class ShowInterest {
        
        public static final double INTEREST_RATE = 2.333;
        
        public static void main(String[] arguments) {
            double balance = 1050.0;
            double interest;
            
            interest = balance * (INTEREST_RATE/100.0);
            System.out.printf("On a balance of $%.2f\n", + balance);
            System.out.printf("you will earn interest of $%.2f\n", + interest);
            System.out.println("All in just one short year.");
            
            
        }
}
