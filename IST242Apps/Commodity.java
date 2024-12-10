package com.IST242Apps;

class commodity {
    public static void main(String[] arguments){
           String command = "BUY";
           int balance = 550;
           int quantity = 42;
           
           switch (command){
               case "BUY" -> {
                    quantity += 5;
                    balance -= 20;
            }
               case "SELL" -> {
                   quantity -= 5;
                   balance += 20;
            }
               
           }      
           
           System.out.println("Balance: $" + balance + '\n'
                   + "Quantity: "+ quantity);
    }  
    
} 

