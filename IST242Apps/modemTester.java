package com.IST242Apps;

public class modemTester {
    public static void main(String[] arguments) {
        cableModem surfBoard = new cableModem();
        dslmodem gateway = new dslmodem();
        surfBoard.setSpeed(500_00);
        gateway.setSpeed(400_00);
        System.out.println("Trying the cable modem:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println("Trying the DSL modem:");
        gateway.displaySpeed();
        gateway.connect();
    }
}
