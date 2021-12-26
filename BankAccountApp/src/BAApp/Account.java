package BAApp;

public abstract class Account implements IRate
{
	//List common properties for savings and checking accounts.
	String name;
	String ssn;
	String accountNum;
	//This is a counter for account number 
	static int index = 1000;
	
	protected double balance;
	protected double rate;
	
		//Constructor to set base properties to initialize the account.
		public Account(String name, String ssn, double InItDeposit)
		{
			this.name = name;
			this.ssn = ssn;
			//set interest rate from method
			this.rate = getInterestRate();
			//set account number from method
			this.accountNum = setAccountNum();
			balance = InItDeposit;
			
			getRate();
		
		}
		//List common methods
		
		public void deposit(double amount)
		{
			balance = balance + amount;
		}
		public void withdraw(double amount)
		{
			balance = balance - amount;
		}
		public void transfer(String toWhere,double amount)
		{
			balance = balance - amount;
		}
		public abstract void getRate();
		
		private String setAccountNum()
		{
			int uniqueID = index;
			String LastTwoOfSSN = ssn.substring(ssn.length()-4, ssn.length());
			return LastTwoOfSSN + uniqueID;
		}
		public void showInfo()
		{
			System.out.println("Name: "+ name +"\nAccount Number: "+accountNum +"\nBalance: "+balance +"\nRate: "+rate
					+"%");
		}
}
