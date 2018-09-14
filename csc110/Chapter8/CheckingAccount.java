package Chapter8;

import java.text.NumberFormat;

public class CheckingAccount  extends BankAccount{
	
	private double transactionFee;
	
	public CheckingAccount()
	{
		super();
		transactionFee = 1.00;
	}
	public CheckingAccount(int acctNo, double initBalance, String owner, double fee) 
	{
		super(acctNo, initBalance, owner);
		transactionFee = fee;
	}
	
	public double getTransactionFee()
	{
		return transactionFee;
	}
	
	public void setTransactionFee(double fee)
	{
		transactionFee = fee;
	}
	public void deposit(double amount)
	{
		balance = balance +amount - transactionFee;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount - transactionFee;
	}
	
	public String toString()
	{
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		return( super.toString() + " transactionFee =" + cFmt.format(transactionFee));
	}
}
