package com.sbs.academy.domain;

import org.springframework.boot.autoconfigure.jms.JmsProperties;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(10, 2);
        System.out.println("결과1 : " + result1);

        byte x = 10;
        byte y = 3;
        double result2 = myCalc.divide(x, y);
        System.out.println("결과2 : " + result2);

        myCalc.powerOff();




    }
}
