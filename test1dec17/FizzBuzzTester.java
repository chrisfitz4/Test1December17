package com.example.test1.test;

public class FizzBuzzTester {

    public String fizzbuzzer(int n){
        String toReturn = "";
        if(n%3==0){
            toReturn += "fizz";
        }
        if(n%5==0){
            toReturn += "buzz";
        }
        return toReturn;
    }

    public static void main(String[] args){
        FizzBuzzTester fizzbuzzer = new FizzBuzzTester();
        System.out.println(fizzbuzzer.fizzbuzzer(3));
        System.out.println(fizzbuzzer.fizzbuzzer(5));
        System.out.println(fizzbuzzer.fizzbuzzer(15));
        System.out.println(fizzbuzzer.fizzbuzzer(45));
        System.out.println(fizzbuzzer.fizzbuzzer(1));
        System.out.println(fizzbuzzer.fizzbuzzer(13));
        System.out.println(fizzbuzzer.fizzbuzzer(35));
        System.out.println(fizzbuzzer.fizzbuzzer(6));
        System.out.println(fizzbuzzer.fizzbuzzer(135));
        System.out.println(fizzbuzzer.fizzbuzzer(33));

    }

}

