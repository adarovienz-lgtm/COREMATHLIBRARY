/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coremathlibrary;

public class Arithmetic extends MathOperation {

    private double num1;
    private double num2;

    public void setNum1(double n) {
        this.num1 = n;
    }

    public void setNum2(double n) {
        this.num2 = n;
    }

    public void add() {
        setResult(num1 + num2);
    }

    public void subtract() {
        setResult(num1 - num2);
    }

    public void multiply() {
        setResult(num1 * num2);
    }

    public void divide() {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            setResult(0);
        } else {
            setResult(num1 / num2);
        }
    }
}