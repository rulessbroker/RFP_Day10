package com.bridgelabz.empwageoops;

import java.util.Random;

public class EmpWageComputation {
	public static void main(String[] args) {
		System.out.println("*****Welcome To Employee Wage Computation*****");
		
		EmpWageComputation.checkEmp();
	}
	
	public static void checkEmp() {
		int rand = (int) (Math.random() * 2);
		
		if(rand == 1) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}

}
