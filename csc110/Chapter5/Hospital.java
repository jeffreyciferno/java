package Chapter5;
/*
Program Name : HospitalEmployee.java
Author : Jeff Ciferno
Date : 10/10/17
Class: CSC110AA/AB and CIS163AA
Description:
Output program based on an object to find the payrate/salary of a hospital employee

*/
import java.text.NumberFormat;

public class Hospital {
	public static void main(String[] args)
	{
	
HospitalEmployee worker1 = new HospitalEmployee();
HospitalEmployee worker2 =new HospitalEmployee();
System.out.println("Welcome to our Hospital!");
System.out.println();
System.out.println("Beginning State of worker1: \n" + worker1.toString());

worker1.setPayRate(20);

System.out.println("After pay rate is set: \n" + worker1.toString());

worker1.setHoursWorked(30);
worker1.changePayRate(4.50);
NumberFormat cFmt =NumberFormat.getCurrencyInstance();
System.out.println("After pay rate and hours worked increase: \n" + worker1.toString());
worker1.calculateBonus("excellent");
System.out.println("Employee " + worker1.getEmpName() +" earned " + cFmt.format(worker1.calculateGrossPay()));

System.out.println("After bonus: "+worker1.getEmpName()+ " received a bonus of "+ cFmt.format(worker1.GetBonus()) + " and earned a total of " + cFmt.format(worker1.GetBonus() + worker1.calculateGrossPay())
		);
System.out.println("======================================");
System.out.println("Creating another Hospital Employee");
worker2.setEmpName("Sue Smart");
worker2.setEmpNumber(1122);
worker2.setPayRate(10.50);
worker2.setHoursWorked(0);
System.out.println("State of worker1: \n" + worker1.toString());
System.out.println("State of worker2: \n" + worker2.toString());
System.out.println("State of workers after worker2 pay rate and hours worked reset.");

worker2.changePayRate(2.25);
worker2.changeHoursWorked(15);
worker2.setPayRate(-10.50);
System.out.println("State of worker1: \n" + worker1.toString());
System.out.println("State of worker2: \n" + worker2.toString());
System.out.println("Employee Sue Smart earned " + cFmt.format(worker2.calculateGrossPay()));

worker2.calculateBonusPercent("excellent");
System.out.println("After bonus: " + worker2.getEmpName() + " received a " + worker2.Getpercent() + " bonus of " + cFmt.format(worker2.GetBonus())+ ".");
System.out.println("Number of HospitalEmployees created : " + worker2.getHospitalEmployeeCount());

System.out.println("Goodbye!");
	
	
	}}


/*

Welcome to our Hospital!

Beginning State of worker1: 
Employee: Jeff Ciferno 	empNumber: 9999 	hoursWorked: 0.0 	payRate: $0.00
After pay rate is set: 
Employee: Jeff Ciferno 	empNumber: 9999 	hoursWorked: 0.0 	payRate: $20.00
After pay rate and hours worked increase: 
Employee: Jeff Ciferno 	empNumber: 9999 	hoursWorked: 30.0 	payRate: $24.50
Employee Jeff Ciferno earned $735.00
After bonus: Jeff Ciferno received a bonus of $500.00 and earned a total of $1,235.00
======================================
Creating another Hospital Employee
State of worker1: 
Employee: Jeff Ciferno 	empNumber: 9999 	hoursWorked: 30.0 	payRate: $24.50
State of worker2: 
Employee: Sue Smart 	empNumber: 1122 	hoursWorked: 0.0 	payRate: $10.50
State of workers after worker2 pay rate and hours worked reset.
State of worker1: 
Employee: Jeff Ciferno 	empNumber: 9999 	hoursWorked: 30.0 	payRate: $24.50
State of worker2: 
Employee: Sue Smart 	empNumber: 1122 	hoursWorked: 15.0 	payRate: $12.75
Employee Sue Smart earned $191.25
After bonus: Sue Smart received a 25% bonus of $47.81.
Number of HospitalEmployees created : 2
Goodbye!

*/