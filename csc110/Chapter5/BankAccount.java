package Chapter5;

import java.text.NumberFormat;

//Simple BankAccout class

//Jciferno
//Sept 27
//
//

public class BankAccount {
	//static variables is exectured first time class is opened
	private static int count = 0;
	// instance variable = state
	private int acctNumber;
	private double balance;
	private String name;
	
	// constructor method = behaviors
	// constructor instaniates (creates) and object when invoked
	// constrcutor sets the inital state of an object when invoked
	public BankAccount() // default constructor
	{
		acctNumber = 0;
		balance = 0.0;
		name = "unknown";
		
		count++;
	}
	
	public BankAccount(int acctNo, double initBalance, String owner)
	{
		acctNumber = acctNo;
		balance = initBalance;
		name = owner;
		
		count++;
	}
	//setter methods also called mutator methods
	//
	public void setAcctNumber(int acct)
	{
		acctNumber = acct;
	}
	
	public void setName(String owner)
	{
		name = owner;
	}
	
	
	// other methods

	public double geBalance() {
		return balance;
	}
	
	
	public void deposit(double amount) 
	{
		balance = balance + amount;
	}

	public void withdraw(double amount) 
	{
		balance = balance - amount;
	}
	public void withdraw(double amount, double fee) 
	{
		fee = 5.00;
		balance = balance - amount -fee;
	}
	public int getacctNumber()
	{
		return 0;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	 public String toString() 
	 {
		 NumberFormat cFmt =NumberFormat.getCurrencyInstance();
		 return ("acctNumber: " + acctNumber + " Balance: " + cFmt.format(balance) + " Name: " + this.name);
		 
	 }
	 public static int getCount()
	 { return count;}
}
