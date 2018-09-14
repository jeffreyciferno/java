package Chapter8;
//Program Name: Doctor 
//Use in Inheritance discussion
//Author:  jeff ciferno
//Brief Description:  Tests inheritance.
	import java.util.Random;
	public class Doctor extends HospitalEmployee 
	
		{

	    private String specialty;

	    public Doctor(String eName, int eNumber, int hours, double pay, String expertise)
	    
	    {
	        super(eName, eNumber, hours, pay);
	        specialty = expertise;
	    }

	    public String getSpecialty()

	    {
	        return specialty;
	    }

	    public void setSpecialty(String expertise) 
	    
	    {
	        specialty = expertise;
	    }

	    public double calculateBonus(String shift) 
	    
	    {

	        if (shift.equalsIgnoreCase("night shift")) 
	        {
	            return super.calculateBonus(10);
	        }
	        
	        else if(shift.equalsIgnoreCase("evening shift"))
	        	
	        {
	            return super.calculateBonus(5);
	        }
	        
	        else 
	        	
	        {
	            return 0;
	        }
	    }

	    public String createLog() 
	    
	    {
	        Random gen = new Random();
	        String logName, logEmp;
	        logEmp = super.getEmpName();
	        logName = logEmp.substring(0,2) + gen.nextInt(10)+ 1 + super.getEmpNumber();

	        return logName;
	    }

	    public String toString() {
	        return (super.toString() + "\nSpecialty: " + specialty);
	    }
	}

