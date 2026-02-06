/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coremathlibrary;

public class MathOperation {
    
    private double result;

    public double getResult() {
        return result;
    }

    protected void setResult(double r) {
        this.result = r;
    }
    
    public void displayResult() {
        System.out.println("Result: " + result);
    }
}