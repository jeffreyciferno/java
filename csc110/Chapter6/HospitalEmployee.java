package Chapter6;
/*
Program Name : HospitalEmployee.java
Author : Jeff Ciferno
Date : 10/10/17
Class: CSC110AA/AB and CIS163AA
Description:
Base Object for finding the payrate/salary of a hospital employee

*/



	import java.text.NumberFormat;
	public class HospitalEmployee1 {
	// class

	//Jciferno
	//Sept 27
	//
	//

		//static variables is exectured first time class is opened
		private double payRate;
		// instance variable = state
		private int empNumber;
		private double hoursWorked;
		private String empName;
		public double bonus;
		private String rating;
		private double grossPay;
		private String percent;
		public static int count;
		// constructor method = behaviors
		// constructor instaniates (creates) and object when invoked
		// constrcutor sets the inital state of an object when invoked
		public HospitalEmployee(String eName, int eNumber, double hours, double pay)
		{
		count++;
		}
		public HospitalEmployee() // default constructor
		{
			empNumber = 9999;
			hoursWorked = 0.0;
			empName = "Jeff Ciferno";
			payRate = 0.0;
		 count++;
		}
	
		public static int getHospitalEmployeeCount()
		{
			return count;
		}
		public String getEmpName()
		{
			return empName;
		}
		
		public int getEmpNumber()
		{
			return empNumber;
		}
	
		public double getHoursWorked()
		{
			return hoursWorked;
		}
		
		public double getPayRate()
		{
			return payRate;
		}
	
		public void setEmpNumber(int eNumber)
		{
		 empNumber = eNumber;	
		}
	
		public void setEmpName(String eName)
		{
		 empName = eName;	
		}
	
		public void setHoursWorked(double Hours)
		{if (Hours >= 0) {
		 hoursWorked = Hours;}	
		}
	
		public void setPayRate(double rate)
		{if (rate >= 0) {
		 payRate = rate;}	
		}
		public void changeHoursWorked(double Hours)
		{
			hoursWorked = hoursWorked + Hours;
		}
		
		public double  calculateGrossPay()
		{NumberFormat cFmt =NumberFormat.getCurrencyInstance();
		 cFmt.format(grossPay = hoursWorked*payRate);
		
			return ((grossPay));}
	
		public void changePayRate(double amount) 
		{
			payRate = payRate + amount;
		}
		public void setRating(String Rating)
		{
		 Rating = rating;
		}
		public void calculateBonus(String rating) 
		{ NumberFormat cFmt =NumberFormat.getCurrencyInstance();
		  if (rating.equals("excellent"))
		  { cFmt.format(bonus = 500);}
		  else if (rating.equals("satisfactory"))
		  { cFmt.format(bonus = 300);}
		  else 
		  { cFmt.format(bonus = 0);}
		}
		public void calculateBonusPercent(String rating) 
		{ NumberFormat cFmt =NumberFormat.getCurrencyInstance();
		  if (rating.equals("excellent"))
		  { cFmt.format(bonus = grossPay * (0.25));
		   percent ="25%"; }
		  else if (rating.equals("satisfactory"))
		  { cFmt.format(bonus = grossPay * (0.125));
		  percent = "12.5%";}
		  else 
		  { cFmt.format(bonus = 0);
		  percent = "no bonus";}
		}
		public double GetBonus()
		{
		return bonus;
		}
		public String Getpercent()
		{
			return percent;
		}
		public String toString() 
			 {
				 NumberFormat cFmt =NumberFormat.getCurrencyInstance();
				 return ("Employee: " + empName + " \tempNumber: " + empNumber + " \thoursWorked: " + hoursWorked + " \tpayRate: " + cFmt.format(payRate) );}
				 
	
		 
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

