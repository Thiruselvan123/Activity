package com.tnsif.assignment_3;
import java.util.Scanner;
public class Exector {
    public static void main(String[] args) {
        Student S= new Student();

        // Create a Commission object
        Commision commision = new Commision();
        // Accept details and calculate commission
        commision.getInput();
        commision.calculateCommision();
    }

}
