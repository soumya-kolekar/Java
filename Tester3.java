package practice;

public class Tester3 {
	public static void main(String[] args) {
		// Implement your code here 
		int accountNumber=1002;
		int salary=51000;
		int accountBalance=350000;
		String loanType="House";
		int loanAmountExpected=300000;
		int emisExpected=30;
		int eligibleLoanAmount;
		int eligibleEmis;
		
	//account Valid
	if(accountBalance>1000 && (accountNumber>999 && accountNumber<1999))
	 //loanAmountExpected
   {if(salary>75000){
	    loanType="Business";
	    eligibleLoanAmount=7500000;
	    eligibleEmis=84;
	    System.out.println("eligibleLoanAmount "+eligibleLoanAmount);
	 System.out.println("eligibleEmis "+eligibleEmis);
	}
	else if(salary>50000){
	    loanType="House";
	    eligibleLoanAmount=6000000;
	    eligibleEmis=60;
	    System.out.println("eligibleLoanAmount "+eligibleLoanAmount);
	 System.out.println("eligibleEmis "+eligibleEmis);
	}
	//house
	else if(salary>25000){
	    loanType="Car";
	    eligibleLoanAmount=500000;
	    eligibleEmis=36;
	    System.out.println("eligibleLoanAmount "+eligibleLoanAmount);
	 System.out.println("eligibleEmis "+eligibleEmis);

	    
	}
	//loan type car


	else 
	{
	    	 System.out.println("Not elligible for Loan. ");
	}
	//business
		}
		else
		{System.out.println("The account is not valid.");
		}
	

}}
