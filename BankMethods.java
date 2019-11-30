import java.util.Arrays;
import java.util.Scanner;

public class BankMethods {

	
	 
	
	
	/**
	 * public static String showMenu()
	 * postcondition: the user has been asked to enter their choice,
	 * 	   based on the MENU options. That value is returned.
	 */
    public static String showMenu(Scanner input){
		/**
		 * Constants
		 */
    	
    	String userInput = "";
    	
		final String MENU = "Type \"add\" to add to an account to the bank" 
			+ "\nType \"deposit\" to deposit funds to an account"
			+ "\nType \"withdraw\" to withdraw funds from an account"
			+ "\nType \"average\" to determine the average of all account balances"
			+ "\nType \"show lowest\" to display the lowest account balance"
			+ "\nType \"show highest\" to display the highest account balance"
			+ "\nType \"remove\" to remove a specifc account"
			+ "\nType \"remove all\" to remove all accounts"
			+ "\nType \"quit\" to exit program"
			;
    	
		// your code goes here

    	System.out.println(MENU);
    	userInput = input.next();
    	
    	
    	return userInput; // just to make the compiler happy - change this
    }

    
    
    String aName[] = new String[15];
    
    
    
    
    public static int addAccount(Scanner input, String[] aName, double [] aBalances, int currentNumberOfAccounts) {
    	
    	//1. Declare variables
    	
    	int newNumberOfAccounts = currentNumberOfAccounts;
    	
    	
    	//2. prompt user for their name
    	
    	String name = promptForName(input);
    	
    	  //2a. prompt user for starting balance
    	
    	double balance = promptForAmount(input);
    	
    	//3. add info the next available array index
    	
    	for(int i = 0; i < aName.length; i++) 
   	 {
            if (aName[i] == null)
            {
           	 aName[i] = name;
           	 aBalances[i]=balance;
           	 System.out.println(aName[i]+ "\t");
           	 //System.out.println(aBalances[i]+ " ");
           	 break;
            }
        }
    	
      
    	 
       newNumberOfAccounts++;
       
       
    	
    	return newNumberOfAccounts;
    }
	
    public static String promptForName(Scanner input) {
    	
    	//1. Declare variables
    	
    	String userInput = "";
    	
    	//2. Prompt user for their name 
    	
    	System.out.println("Please enter your name: ");
    	
    	//3. get input
    	
    	userInput = input.next();
    	
    	return userInput;
    	
    	
    	
    }
    
    public static double promptForAmount(Scanner input) {
    	//1. Declare variables
    	
    	double amount = 0;
    	
    	//2. prompt user for the amount
    	
    	System.out.println("Please enter an amount: ");
    	
    	//3. get input
    	
    	amount = input.nextInt();
    	
    	
    	return amount;
    }
    
    public static int promptForAccNum(Scanner input) {
    	
    	//1. Declare variables
    	
    	int accNum = 0;
    	
    	
    	//2. prompt user for Account Number
    	
    	System.out.println("Please enter youre new account number: ");
    	accNum = input.nextInt();
    	
    	
    	return accNum;
    	
    	
    	
    	
    	
    	
    }
    
    
    public static int findAcct(int[] acctnum, int num_accts, int account) {
        for(int i=0; i<num_accts; i++)
            if(account== acctnum[i])
                return i;
        return -1;
    }


	
	
	
	public static void deposit(Scanner input, String[] aName, double[] aBalances, int currentNumberOfAccounts, double amount) {
		
	//1. declare variables
		
		String accountName = "";
		double depositAmount = 0.0;
		double balance = aalances[i];
	
		
		
    //2. prompt user to enter
	
		System.out.println("Please enter the name on the account: ");
		accountName = input.next();
		
	
	//3. prompt user for deposit amount
		
		
		System.out.println("Deposit amount: ");
		amount = input.nextInt();
		
		//3. calc deposit with current balance
		
		
		if (amount<=0) {
            System.out.println("Amount to be deposited should be positive");
        } else {
            balance = balance + amount;
            
        }
	    	 
	   
		
	}	
	
	
	
	
	
	
	
	public static void display(String aNames[], double[] aBalances, int currentNumberOfAccounts)
	{
		for(int i=0;i<currentNumberOfAccounts;i++)
		{
			System.out.println("Name:"+aNames[i]+"\t"+"Balance:"+aBalances[i]);
		}
	}
	
	
	
	
	
	
	
	
	
}





