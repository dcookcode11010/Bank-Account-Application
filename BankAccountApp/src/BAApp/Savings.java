package BAApp;

public class Savings extends Account
{
	public Savings(String name, String ssn, double InItDeposit)
	{
		super(name, ssn, InItDeposit);
		accountNum = "1" +accountNum;
		
	}
	public void getRate()
	{
		rate = getInterestRate() - .25;
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Saving");
		
	}

}
