package BAApp;

import java.util.List;

public class BankAccoApp {
	
	public static void main (String[] args)
	{
		String file = "/Users/me/Documents/workspace/BankAccountApp/src/Utilities/NewBankAccounts";
		
		List<String[]> newCustomers = Utilities.CSV.read(file);
		
		for(String[] accountHolder : newCustomers)
		{
			System.out.println("New Account");
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double InItDeposit = Double.parseDouble(accountHolder[3]);
			System.out.println(name + " " + ssn + " " + accountType + " " + InItDeposit);
		}
	}

}
