package com.IST242Apps;

public class InitArray
{
    public static void main(String[] arguments)
    {
        // initializer list specifies the value for each element
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        
        System.out.printf("%s%8s\n", "Index", "Value");
        
        for (int counter = 9; counter >= 0; counter--){
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }
}
