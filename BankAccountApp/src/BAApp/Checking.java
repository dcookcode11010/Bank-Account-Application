package BAApp;

public class Checking extends Account
{
	//List the properties of a checking account.
	
	//Constructor to initialize check account properties.
	
	public Checking(String name, String ssn, double InItDeposit)
	{
		super(name, ssn, InItDeposit);
		accountNum = "2" +accountNum;
		
	}
	public void getRate()
	{
		rate = getInterestRate() * .15;
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking");
		
	}

}