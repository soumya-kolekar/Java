package practice;

public class tester8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implement your code here 
		int n=371;
	
		int sum=0, rem,num;
			num=371;
		while(n!=0)
		{
		   rem=n%10;
		    sum=sum+(rem*rem*rem);
		    n=n/10;
		}
		if(sum==num)
		System.out.println(num +" is an Armtrong number");
		else
		System.out.println(num +" is not an Armtrong number");
	}

}
