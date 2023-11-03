package com.sbs.academy.Bank;

public class User {
    private String name;
    private int age;
    int cashAmount;
    AccountNumber account;

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }



}
