//Account.java
//Account class that contains an instance variable name
//and methods to configure and obtain its value.

public class Account 
{
	private String name;//instance variable
	private double balance;//instance variable

	// Account constructor that takes two parameters
	public Account(String name, double balance) 
	{
		this.name = name;

		// validate that the balance is greater than 0.0; if not,
		// the balance instance variable keeps its initial default value of 0.0
		if (balance > 0.0)// if the balance is valid
			this.balance = balance;// assign it to the balance instance variable
	}

	// method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0)//if the depostAmount is valid
			balance = balance + depositAmount;//add it to the balance	
	}

	public void displayAccount(String name)
	{
		this.name = name;
		System.out.println("Account name: "+ name);
		System.out.println("balance: "+ this.getBalance());

	}

	// method to set the name on the object
	public void setname(String name) 
	{
		this.name = name;// store the name
	}
	
	public String getName()
	{
		return name;//returns the name value to the caller
	}
	
	public double getBalance()
	{
		return balance;
	}

}//end of class Account