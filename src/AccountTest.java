// Figure 3.6: AccountTest.Java
// Using Account's constructor to initialize instance name
// variable at the time each Account object is created.

import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		// create two Account objects
		Account account1 = new Account("Jane Green",50.00);
		Account account2 = new Account("John",-7.53);

		// display the initial value of name for each Account
		System.out.printf("%s balance: $%.2f %n",
			account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n",
			account2.getName(),account2.getBalance());

		// create a Scanner to get input from the command window
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");//prompt
		double depositAmount = input.nextDouble();// get user input
		System.out.printf("%nadding %.2f to account1 balance%n%n",
			depositAmount);
		account1.deposit(depositAmount);// add account1 balance

		// display balances
		System.out.printf("%s balance: $%.2f %n",
			account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n",
			account2.getName(),account2.getBalance());

		System.out.print("Enter deposit amount for account2: ");//prompt
		depositAmount = input.nextDouble();// get user input
		System.out.printf("%nadding %.2f to account2 balance%n%n",
			depositAmount);
		account2.deposit(depositAmount);// add account2 balance

		// display balances
		System.out.printf("%s balance: $%.2f %n",
			account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n",
			account2.getName(),account2.getBalance());
	}

} // end of AccountTest class