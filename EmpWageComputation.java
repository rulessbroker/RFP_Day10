package com.bridgelabz.empwageoops;

public class EmpWageComputation {
	public final static int PER_HR_EMP_WAGE = 20; 
	public final static int HR_PER_DAY = 8; 
	public final static int PART_TIME_HR = 4; 
	static int rand = (int) (Math.random() * 3);
	
	public static void main(String[] args) {
		System.out.println("*****Welcome To Employee Wage Computation*****\n");
		
		empWage();
	}
	
	public static void empWage() {
		switch(rand) {
		case 1:
			int dailyEmpWage = PER_HR_EMP_WAGE * HR_PER_DAY;
			System.out.println("Employee is Present and wage is" +" "+ dailyEmpWage + " "+"Rs Only");
			break;
			
		case 2: 
			int isWage = PER_HR_EMP_WAGE * (HR_PER_DAY + PART_TIME_HR);
			System.out.println("Employee is Present Full time as weel as Part time and wage is " + " "+ isWage + " "+ "Rs only");
			break;
		
		default:
			System.out.println("Employee is absent");
		}
		
	}
	
	

}
