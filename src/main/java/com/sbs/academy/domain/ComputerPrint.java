package com.sbs.academy.domain;

public class ComputerPrint {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int[] values1 = {1, 2, 3};
        int result1 = myCom.sum1(values1);
        System.out.println("결과1: " + result1);

        int result2 = myCom.sum1(new int[]{1,2,3,4,5});
        System.out.println("결과2: " + result2);
    }
}
