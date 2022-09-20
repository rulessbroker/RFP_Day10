package com.bridgelabz.empwageoops;

public class EmpWageComputation {
	public final static int PER_HR_EMP_WAGE = 20; 
	public final static int HR_PER_DAY = 8; 
	public final static int PART_TIME_HR = 4; 

	
	
	public static void main(String[] args) {
		System.out.println("*****Welcome To Employee Wage Computation*****\n");
		
		checkEmp();
		
		dailyWage();
		
		partTimeWage();
	}
	
	public static void checkEmp() {
		int rand = (int) (Math.random() * 2);
		
		if(rand == 1) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}
	
	public static void dailyWage() {
		int dailyEmpWage = PER_HR_EMP_WAGE * HR_PER_DAY;
		
		System.out.println("\nDaily Employee Wage is" +" " + dailyEmpWage + " "+"Rs Only" );
	}
	
	public static void partTimeWage() {
		int partTimeEmpWage = PART_TIME_HR * PER_HR_EMP_WAGE;
		
		System.out.println("\nPart Time Employee Wage is" +" " + partTimeEmpWage + " "+"Rs Only" );

	}

}
