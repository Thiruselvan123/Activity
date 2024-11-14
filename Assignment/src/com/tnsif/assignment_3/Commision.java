package com.tnsif.assignment_3;
import java.util.*;

public class Commision {
	private String name;
    private String address;
    private String phone;
    private double salesAmount;
    
    
    
    public void getInput() {
        Scanner S= new Scanner(System.in);
        System.out.print("Enter name: ");
        name = S.nextLine();
        System.out.print("Enter address: ");
        address = S.nextLine();
        System.out.print("Enter phone: ");
        phone = S.nextLine();
        System.out.print("Enter sales amount: ");
        salesAmount = S.nextDouble();
    }

    public void calculateCommision() {
        double commision;
        if (salesAmount >= 100000) {
            commision = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commision = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commision = salesAmount * 0.03;
        } else {
            commision = 0;
        }
        System.out.println( commision);
    }
}




