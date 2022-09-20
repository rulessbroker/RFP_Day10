package com.bridgelabz.empwageoops;

import java.util.Scanner;

public class EmpWageComputation {
	
	
	public static void main(String[] args) {
		System.out.println("*****Welcome To Employee Wage Computation*****\n");
		Company.totalWage();
	}
	
	static class Company{
		public final static int PER_HR_EMP_WAGE = 20; 
		public final static int HR_PER_DAY = 8; 
		public final static int PART_TIME_HR = 4; 
		int rand = (int) (Math.random() * 3);
		static int workingDays;
		static int workingHrs;
		public final static int TOTAL_WORKING_HRS = 100; 
		public final static int TOTAL_WORKING_DAYS = 20; 

		static Scanner input = new Scanner(System.in);
		
		public static void totalWage() {
			System.out.println("Enter a working days of employee - ");
			workingDays = input.nextInt();
			System.out.println("Enter a working Hours of employee - ");
			workingHrs = input.nextInt();
			int dailyEmpWage = PER_HR_EMP_WAGE * HR_PER_DAY;
			int totalWage = dailyEmpWage * workingDays;
			if(workingDays <= TOTAL_WORKING_DAYS || workingHrs <= TOTAL_WORKING_HRS ) {
				System.out.println("working days of employee is " + workingDays +" "+"and Total working hours is "+ " "+workingHrs+" "+ "and employee wage is "+ totalWage +" "+ "Rs only" );
			}
			
		}
	}
	
	
	

}
