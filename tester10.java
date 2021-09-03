package practice;

public class tester10 {

	public static void main(String[] args) {
		
				// Implement your code here 
				int n1=5;
				int n2=10;
				int a=n1;
				int b=n2;
				int gcd=1;
				int lcm,n;
		   n=a*b;
		for(int i = 1; i <= n1 && i <= n2; i++)  
		{   
		if(n1%i==0 && n2%i==0)  
		gcd = i;  
		}  
				lcm=(n/gcd);
				System.out.println(lcm);
			
		

	}

}
