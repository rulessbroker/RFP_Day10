package com.bridgelabz.empwageoops;

import java.util.Scanner;

public class EmpWageComputation {
	public final static int PER_HR_EMP_WAGE = 20; 
	public final static int HR_PER_DAY = 8; 
	public final static int PART_TIME_HR = 4; 
	static int rand = (int) (Math.random() * 3);
	static int workingDays;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("*****Welcome To Employee Wage Computation*****\n");
		
		monthlyWage();
	}
	
	public static void monthlyWage() {
		System.out.println("Enter a working days of employee - ");
		workingDays = input.nextInt();
		int dailyEmpWage = PER_HR_EMP_WAGE * HR_PER_DAY;
		int totalWage = dailyEmpWage * workingDays;
		if(workingDays <= 20) {
			System.out.println("working days of employee is " + workingDays +" "+ "and employee wage is "+ totalWage +" "+ "Rs only" );
		}
		
	}
	
	

}
