package com.tnsif.assignment_2;

import java.util.Scanner;

public class Data {
    private double radius;
    private String color;

    public void getInput() {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = S.nextDouble();
        System.out.print("Enter the color of the circle: ");
        color = S.next();
    }


    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("The area of the circle is: %.2f%n", area);
    }

 
    public static void main(String[] args) {
        Data C = new Data();
        C.getInput();
        C.calcArea();
    }
}

