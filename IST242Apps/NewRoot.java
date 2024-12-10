package com.IST242Apps;

class NewRoot {
      public static void main(String[] argument) {
          int number = 100;
          
          if (argument.length > 0) {
           number = Integer.parseInt(argument[0]);
      }
         System.out.println("The square root of " 
         + number
         + " is "
         + Math.sqrt(number));
      }
}