package com.bridgelabz.empwageoops;

import java.util.Scanner;

import com.bridgelabz.newempwage.Company;

public class EmpWageComputation {
	
	
	public static void main(String[] args) {
		System.out.println("*****Welcome To Employee Wage Computation*****\n");
		Scanner input = new Scanner(System.in);
		
		 Company company1 = new Company("Mastang", 45, 18, 120);
		    System.out.println(company1);

		    Company company2 = new Company("Rolls Royals", 50, 15, 150);
		    System.out.println(company2);
		    
		    System.out.print("\nEnter company name ==> ");
		    String companyName = input.nextLine();

		    System.out.print("Enter the company wage per hour =");
		    int wagePerHr = input.nextShort();

		    System.out.print("Enter the number of days to work per month = ");
		    int daysToWork = input.nextShort();

		    System.out.print("Enter the number of hours per month = ");
		    int hrsToWork = input.nextShort();
		    input.close();
		
		Company name = new Company(companyName, wagePerHr, daysToWork, hrsToWork);
		System.out.println(name);
		
	}
}
	
	class Company{
		static short fullTimeHrs = 10;
		static short partTimeHrs = 3;
		String companyName = " ";
		int wagePerHr;
		int daysToWork;
		int hrsToWork;
		int monthlywage;
		int totlaHrsWorked;
		int totalDaysWorked;
		
		 public Company(String companyName, int wagePerHr, int daysToWork, int hrsToWork) {
			    this.companyName = companyName;
			    this.wagePerHr = wagePerHr;
			    this.daysToWork = daysToWork;
			    this.hrsToWork = hrsToWork;
			   

	}
		 public String toString() {
			return  "\n Employee worked in " + companyName + " has made " + monthlywage + " Rs by working " + totlaHrsWorked + " hours in " + totalDaysWorked + " days this month ";
			
		 }
		 
	
	}

