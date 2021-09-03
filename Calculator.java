package practice;


	class Calculator {

		// Implement your code here
	public int num;
	public int sumOfDigits()
	{int sum=0;
	    while(num!=0)
	    {int a = num % 10;
	        sum=sum+(a);
	        num=num/10;
	    }return sum;
	}}

