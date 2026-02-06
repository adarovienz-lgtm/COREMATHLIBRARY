/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coremathlibrary;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- MATH LIBRARY TEST ---");

        // 1. Testing Arithmetic
        System.out.println("\n[Arithmetic]");
        Arithmetic math = new Arithmetic();
        
        math.setNum1(15);
        math.setNum2(10);
        
        math.add();
        System.out.print("Adding 15 + 10: ");
        math.displayResult();

        // Testing Division by Zero (Required)
        System.out.print("Dividing by 0: ");
        math.setNum2(0);
        math.divide(); 

        // 2. Testing Geometry
        System.out.println("\n[Geometry]");
        Geometry geo = new Geometry();

        // Circle
        geo.setRadius(5);
        geo.computeCircleArea();
        System.out.print("Circle Area (r=5): ");
        geo.displayResult();
        
        geo.computeCircleCircumference();
        System.out.print("Circle Circumference: ");
        geo.displayResult();

        // Rectangle
        geo.setRectangleDimensions(4, 6);
        geo.computeRectangleArea();
        System.out.print("Rectangle Area (4x6): ");
        geo.displayResult();

        // 3. Testing Number Analysis
        System.out.println("\n[Number Analysis]");
        NumberAnalysis num = new NumberAnalysis();

        // Prime Check
        num.setNumber(7);
        System.out.print("Check Prime (7): ");
        num.checkPrime();

        // Even/Odd Check
        num.setNumber(8);
        System.out.print("Check Even/Odd (8): ");
        num.checkEvenOdd();

        // Factorial
        num.setNumber(5);
        num.calculateFactorial();
        System.out.print("Factorial (5!): ");
        num.displayResult();
    }
}