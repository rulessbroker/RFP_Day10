package com.bridgelabz.empwageoops;

public interface EmpWageService {
	 void getWageByCompany();

	  void addCompanyEmpWage(String company, short empWagePerHr, short daysToWork, short hrsToWork);

	  void getMonthlyWage();

	  short getMonthlyWage(CompanyEmpWage c);

	  short getDailyWage(short empWagePerHr);

	  String checkAttendance();

	  }


