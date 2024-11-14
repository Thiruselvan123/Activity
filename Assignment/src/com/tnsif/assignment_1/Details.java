package com.tnsif.assignment_1;

public class Details {
	private String name;
	private int rollno;
	private char grade;
	private float percentage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString()
	{
		return  "name:"+name+" rollno:"+rollno+" grade:"+grade+" percentage:"+percentage;
	}

}
