package com.IST242Apps;

class Benchmark {
    public static void main(String[] arguments) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 1200_00;
        int index = 0;
        long x = (long) Math.sqrt(index);       
       
        while (System.currentTimeMillis() < endTime) {
         x++;
    
        }
        System.out.println(x + " loops in two minutes.");

          
        
    
            
    
         }
    }
