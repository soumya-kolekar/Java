package practice;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implement your code here 
		int n=2250;//123
		int sum=0;
		for(int i=0;i<=n;i++)
		{
		    sum+=i;
		}
		
		if(sum%n==sum/n)
		     System.out.println(n +" is divisible by sum of its digits");
		else
			System.out.println(n +" is not divisible by sum of its digits");//for123
	}

}
