/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coremathlibrary;

public class NumberAnalysis extends MathOperation {

    private int number;

    public void setNumber(int n) {
        this.number = n;
    }

    public void checkPrime() {
        if (number <= 1) {
            System.out.println(number + " is not prime.");
            setResult(0); 
            return;
        }
        
        boolean isPrime = true;
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is prime.");
            setResult(1); 
        } else {
            System.out.println(number + " is not prime.");
            setResult(0);
        }
    }

    public void calculateFactorial() {
        if (number < 0) {
            System.out.println("Error: No factorial for negative numbers.");
            setResult(0);
            return;
        }
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        setResult(fact);
    }

    public void checkEvenOdd() {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
            setResult(2); 
        } else {
            System.out.println(number + " is Odd.");
            setResult(1); 
        }
    }
}