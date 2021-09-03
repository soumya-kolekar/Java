package practice;

public class testerTwo {public static void main(String args[]) {
	
	Rectangle rectangle=new Rectangle();
	//Assign values to the member variables of Rectangle class
	rectangle.length = 12f;
	rectangle.width = 5f;
	
	//Invoke the methods of the Rectangle class to calculate the area and perimeter
//	double a = rectangle.calculateArea();
//	double b = rectangle.calculatePerimeter();
	 rectangle.getArea();
	 rectangle.getPerimeter();
	//Display the area and perimeter using the lines given below
	System.out.println("Area of the rectangle is " + rectangle.getArea());
	System.out.println("Perimeter of the rectangle is " + rectangle.getPerimeter());
}

}


		
