package com.tnsif.assignment_1;
import java.util.*;

public class DetailsDemo {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		Details D=new Details();
		System.out.println("name:");
		D.setName(S.nextLine());
		System.out.println("rollno:");
		D.setRollno(S.nextInt());
		System.out.println("grade:");
		D.setGrade(S.next().charAt(0));
		System.out.println("percentage:");
		D.setPercentage(S.nextFloat());
		System.out.println(D);
		
		

	}

}
