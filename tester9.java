package practice;

public class tester9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1623;
		
		
		int sum=0, rem,num;
			num=n;
			int count=0;
			
		while(n!=0)
		{
		    
		    if(count%2 == 0)
		    {rem=n%10;
		    sum=sum+(rem*rem); count++;
		    }
		    else{ count=0;}
		    n=n/10;
		}
		if(sum%9==0)
		System.out.println("The number " +num +" is an lucky number");
		else
		System.out.println("The number "+num +" is not lucky number");
	}

}
