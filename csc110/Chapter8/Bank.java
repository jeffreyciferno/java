package Chapter8;
//Program Name: Bank.java - Creates BankAccount objects and CheckingAccount objects 
//Use in Inheritance discussion
//Author:  Patricia Baker
//

//Brief Description:  Tests the BankAccount and CheckingAccount classes.

public class Bank
{
	public static void main( String [ ] args)
	{
		System.out.println("Welcome to our Bank\n");
		
		//create BankAccount object
		BankAccount myAcct = new BankAccount();
		//System.out.println(" " + myAcct.getClass() );
		System.out.println("Status of myAcct: " + myAcct.toString( ) );
		
		myAcct.deposit(100);		
		myAcct.withdraw(25);
		
		System.out.println("The balance of myAcct is : " + myAcct.getBalance( ) );
		
		
		System.out.println("\nA Checking Account");
		CheckingAccount studentAccount = new CheckingAccount();
		
	 	System.out.println("The beginning state of studentAccount: " + studentAccount.toString());
	 	
	 	studentAccount.deposit(50.00);
	 	
	 	System.out.println("The state of studentAccount after deposit: " + studentAccount.toString());
	 	
	 	studentAccount.setTransactionFee(10);
	 	
	 	studentAccount.deposit(15.00);
	 	
	 	System.out.println("The state of studentAccount after setting transaction fee and deposit: " + studentAccount.toString());
	 	
	 	System.out.println("The Number of Accounts: " + BankAccount.getAcctCount());
	}


}//end of Bank