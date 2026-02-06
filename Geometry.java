/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coremathlibrary;

public class Geometry extends MathOperation {

    private double radius;
    private double length;
    private double width;

    public void setRadius(double r) {
        if (r < 0) {
            System.out.println("Error: Radius cannot be negative.");
            this.radius = 0;
        } else {
            this.radius = r;
        }
    }

    public void setRectangleDimensions(double l, double w) {
        if (l < 0 || w < 0) {
            System.out.println("Error: Dimensions cannot be negative.");
            this.length = 0;
            this.width = 0;
        } else {
            this.length = l;
            this.width = w;
        }
    }

    public void computeCircleArea() {
        setResult(3.1416 * radius * radius);
    }

    public void computeCircleCircumference() {
        setResult(2 * 3.1416 * radius);
    }

    public void computeRectangleArea() {
        setResult(length * width);
    }

    public void computeRectanglePerimeter() {
        setResult(2 * (length + width));
    }
}