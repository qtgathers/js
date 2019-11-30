import java.util.Scanner;

/**
 * 
 */

/**
 * @author quinteria
 *
 */
public class BankManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]=new String[10];// is it ok?
		
		
		double balances[]= new double[10];
		double amount = 0.0;
		//n is total names 
		int n=names.length;
		
		// currentNumberOfAccounts is Actual total number of Accounts
		int currentNumberOfAccounts=0;
		// we repeat this loop forever
		while(true)
		{
		    // take the object of Scanner class for input which is used in almost all methods
			Scanner input=new Scanner(System.in);
			//this input object is used to take input in the showMenu() method
			String choice=BankMethods.showMenu(input);
			//do operation according to your choice
			switch(choice)
			{
			    //add new account
				case "add":
				    //Now we are using input, names, balances, currentNumberOfAccounts . Initially currentNumberOfAccounts is 0
				    //It will return the new currentNumberOfAccounts by adding 1 in the previous one. 
				    //In your code it is missing
					currentNumberOfAccounts=BankMethods.addAccount(input, names, balances, currentNumberOfAccounts);
					
					BankMethods.display(names, balances, currentNumberOfAccounts);
					break;
				case "deposit":
					
					BankMethods.deposit(input, names, balances, currentNumberOfAccounts, amount);
					
					
				case "withdraw":
				
			    //if the  the user enter quit in the choice then it will come out from the loop
				case "quit":
				    
			}
		}

	}
}



