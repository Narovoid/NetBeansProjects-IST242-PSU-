package com.IST242Apps;

public class modem {
    private int speed;
    
    public void displaySpeed(){
        System.out.println("Speed: " + getSpeed());
    }
/**
 * @return the speed
 */
public int getSpeed(){
    return speed; 
}
/**
 * @param speed the speed to set
 */

public void setSpeed(int speed){
    this.speed = speed;
    }
}

