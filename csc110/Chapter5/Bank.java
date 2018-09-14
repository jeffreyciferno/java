package Chapter5;
//Simple BankAccout class

//Jciferno
//Sept 27
//
//



public class Bank {
	
	public static void main(String[] args)
	{
	//create a BankAccount object called myAcct
		BankAccount myAcct = new BankAccount();
	//display the state of object myAcct
		System.out.println("Welcome to our Bank!");
		System.out.println();
	System.out.println("Beginning State of myAcct: " + myAcct.toString());
	//deposit 100.00 in myAcct
	myAcct.deposit(100.00);
	//display the balance in myAcct
	System.out.println("The balance of myAcct after deposit is: " + myAcct.geBalance());
	//withdraw 25.00 from myAcct
		myAcct.withdraw(25.00);
	//display the state of Object myAcct
		System.out.println("State of myAcct after deposit and withdraw is: " + myAcct.toString());
	//create another object called patAccount
		//BankAccount jeAccount = new BankAccount();
		//jeAccount.deposit(15.00);
		//System.out.println("The balance of JeAcct after deposit : " +jeAccount.geBalance());
	

	
	//create a BankAccount object called studentAcct
	BankAccount studentAcct = new BankAccount();
	//studentAcct should be owned by sue Student
	studentAcct.setName("sue student");
	//studentAcct account number should be 1234
	studentAcct.setAcctNumber(1234);
	//display the state of object studentAcct
	System.out.println("State of studentAcct: " + studentAcct.toString());
	
	studentAcct.deposit(200.00);
	
	studentAcct.withdraw(30.00);
	
	System.out.println("State of studentAcct: " + studentAcct.toString());
	
	System.out.println("The balance of studentAcct after deposit/withdraw: " + studentAcct.geBalance());
	
	System.out.println("State of myAcct: " + myAcct.toString());
	
	System.out.println("State of myAcct: " + studentAcct.toString());
	
	
BankAccount teacherAcct = new BankAccount(4444, 1500, "James Gosling");
	
	System.out.println("State of TeacherAcct: " + teacherAcct.toString());
	teacherAcct.withdraw(50, 0);
	System.out.println("State of TeacherAcct after withdraw: " + teacherAcct.toString());
}

}






/*


Welcome to our Bank!

Beginning State of myAcct: acctNumber: 0 Balance: $0.00 Name: unknown
The balance of myAcct after deposit is: 100.0
State of myAcct after deposit and withdraw is: acctNumber: 0 Balance: $75.00 Name: unknown
State of studentAcct: acctNumber: 1234 Balance: $0.00 Name: sue student
State of studentAcct: acctNumber: 1234 Balance: $170.00 Name: sue student
The balance of studentAcct after deposit/withdraw: 170.0
State of myAcct: acctNumber: 0 Balance: $75.00 Name: unknown
State of myAcct: acctNumber: 1234 Balance: $170.00 Name: sue student









*/