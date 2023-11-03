package com.sbs.academy.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //카운팅, 합계, 평균값, 최대, 최소 ==> 집계
        // 메소드
        /* 리턴타입
        long                    count()
        OptionalOOO                findFirst()
        Optional<T>             max(Comparator<T>)/max()
        Optional<T>             max(Comparator<T>)/min()
        OptionalDouble          average()
        int,long,double         sum()

        get()
        getAsDouble()
        getAsInt()
        getAsLong()
        */

        /*
        long count = Arrays.stream(new int[]{1,2,3,4,5})
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("2의 배수의 갯수: " + count);

        List<Integer> list = new ArrayList<>();
        double avg = list.stream()
                .mapToDouble(Integer::intValue)
                .average()
                .ifPresent()
                .getAsDobule();
        System.out.println("평균값 : " + avg);
         */




    }
}
