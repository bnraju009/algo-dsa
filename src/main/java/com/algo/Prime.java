package com.algo;

public class Prime {
    public static void main(String orgs[]){
        System.out.println("Find out given number is prime or not");
        int inputVal=7;
        boolean isPrime=isPrime(inputVal);
        System.out.println("Given number is => "+isPrime);
    }

    private static boolean isPrime(int inputVal) {
        if(inputVal<=1){
            return false;
        }
        if(inputVal==2 || inputVal%2!=0){
            return true;
        }
        return false;
    }
}
