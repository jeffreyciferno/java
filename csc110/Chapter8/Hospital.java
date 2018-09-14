package Chapter8;
//Program Name: Hospital 
//Use in Inheritance discussion
//Author:  jeff ciferno
//Brief Description:  Tests inheritance.
import java.text.NumberFormat;

public class Hospital {

    public static void main(String[] args) {
       
    	NumberFormat cFmt = NumberFormat.getCurrencyInstance();

        System.out.println("Welcome to our Hospital");

        HospitalEmployee luke = new HospitalEmployee("Luke Skywalker", 5432, 40, 20.50);

        System.out.println("Beginning state of Luke:\n" + luke.toString());
       
        System.out.println(luke.getEmpName() + " is a satisfactory employee. " + "Bonus: " + cFmt.format(luke.calculateBonus("satisfactory")));
        
        System.out.println("\n");
        
        Doctor Darth = new Doctor("Darth Vader", 9876, 17, 150.00, "Plastic Surgery");

        System.out.println("Beginning state of Darth:\n" + Darth.toString());
        
        System.out.println(Darth.getEmpName() + " is a Doctor and works the evening shift. " + "Bonus: " + cFmt.format(Darth.calculateBonus("evening shift")));
        
        System.out.println(Darth.getEmpName() + "'s login is: " + Darth.createLog());
        
        System.out.println("\n");
        
        System.out.println("Number of Hospital Employees created: " + HospitalEmployee.getHospitalEmployeeCount());
        
        System.out.println("Goodbye!");
       
        
    }

}
/*
Welcome to our Hospital
Beginning state of Luke:
empName:	Luke Skywalker	empNumber:	5432	hoursWorked: 40.0	payRate: $20.50
Luke Skywalker is a satisfactory employee. Bonus: $300.00


Beginning state of Darth:
empName:	Darth Vader	empNumber:	9876	hoursWorked: 17.0	payRate: $150.00
Specialty: Plastic Surgery
Darth Vader is a Doctor and works the evening shift. Bonus: $127.50
Darth Vader's login is: Da119876


Number of Hospital Employees created: 2
Goodbye!
*/