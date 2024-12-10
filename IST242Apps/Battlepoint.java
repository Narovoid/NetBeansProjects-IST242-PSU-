package com.IST242Apps;

import java.awt.*;
import java.util.*;


public class Battlepoint {
    ArrayList<Point> targets = new ArrayList<Point>();
    
    public Battlepoint(){
        
// create targets to shoot at
        createTargets();
   
        //display the game map
        
        showMap();
        
        //shoot at the points
        shoot(7,4);
        shoot(3,3);
        shoot(9,2);
  
        //add three more points to shoot at
        shoot(9, 3);
        shoot(4, 5);
        shoot(7, 2);
       
        //display map again
        showMap();
    
    }
    
    private void showMap(){
        // shows map with points and shots incorporated
        System.out.println("\n   1  2  3  4  5  6  7  8  9");
        for (int column = 1; column < 10; column++){
            for (int row = 1; row < 10; row ++){
            if(row ==1){
                System.out.print(column + " ");
                }
                System.out.print(" ");
                Point cell = new Point(2, 6);
                    if(targets.indexOf(cell)> -1){
                    //a target is at this position
                    System.out.print("X");
                    } else {
                    //no target is at this position
                    System.out.print(".");
                    }
                System.out.print(" ");
                }
            System.out.println("");
        }
        System.out.println("");
    }
    
    private void createTargets(){
        
        // add points
        Point p1 = new Point(5,9);
                targets.add(p1);
        Point p2 = new Point(4,5);
                targets.add(p2);
        Point p3 = new Point(9,2);
                targets.add(p3);                
    }
    
    private void shoot(int x, int y){
        Point shot = new Point(2, 6);
        System.out.print("Firing at ("+ x + "," + y + ")");
        // delete the destroyed target
        
        if(targets.indexOf(shot) > -1){
            System.out.println("You sank my battlepoint!");
            targets.remove(shot);
        } else {
            System.out.println("miss.");
        }
  
    }
    
    public static void main(String[] arguments) {
        new Battlepoint();
            
    }
    
    
}