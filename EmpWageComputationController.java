package com.bridgelabz.empwageoops;

public class EmpWageComputationController {
	 public static void main(String[] args) {
		    System.out.println("--Welcome to Employee Wage Computation Program--");

		    EmpWageService empWageBuilder = new EmpWageComputation();

		    empWageBuilder.addCompanyEmpWage("Reliance", (short) 20, (short) 20, (short) 100);
		    empWageBuilder.addCompanyEmpWage("Amazon", (short) 30, (short) 25, (short) 120);
		    empWageBuilder.addCompanyEmpWage("Google", (short) 50, (short) 25, (short) 130);

		    empWageBuilder.getMonthlyWage();

		    
		  }

}
