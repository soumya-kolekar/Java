package practice;

public class Tester7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implement your code here 
		int x=123,prod=1,y=738;
		int s;
		s=x;
		 while(x!=0)
		  { prod=prod*(x%10);
		    x=x/10;
		    }
		    if((s*prod) == y)
		     { System.out.println(s+" is a seed of "+y);}
		    else
		     {System.out.println(s+" is not a seed of "+y);}
	}

}
