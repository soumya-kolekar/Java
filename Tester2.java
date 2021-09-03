package practice;

	class Tester2 {
		public static void main(String[] args) {
			// Implement your code here 
		//Quadratic
			int a=1;
			int b=5;
			int c=2;
			float discriminant,x1,x2,x;
			discriminant = ((b*b) - (4*a*c));
			x1 = ((((-b) + (discriminant)))/(2*a));
			x2 = ((((-b) - (discriminant)))/(2*a));
		
			if( discriminant == 0)
			{
			    System.out.print("The root is " + x1);
			}
			else if( discriminant > 0)
			{
			    System.out.print("The roots are unequal " + x1 +" and "+ x2);
			}
			else if( discriminant < 0)
			{
			    System.out.print("The equation has no real roots");
			}
			else
			{
			    System.out.print("Enter valid values ");
			}
			
		}
	}

