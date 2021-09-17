package DayOne;

public class JavaIOne {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {//
		//open cmd
		
		//set env 
		//go to directory which you have saved
		//type javac hello.java
		//if bad cmd--check the path or name
		//else prompt shown--compilation successfull
		//compiler create a file hello.class->creates byte code
		//-->contains intructions ---> helps to run interpreter
		
		// platform independenetto execute== .java->javac(compiler)->.class(bytecode run on different platforms)
		
		int a=5;
		float b= 7.8f;
		double d=5.0;
		char c = 'A';
		boolean bo = true;
		System.out.println("My first project after release");
		
//Type conversion
		System.out.println("Widening");

		//Widening /implicit Conversion-Variables of smaller Capacity can be assigned to another variable of larger capacity
	int i=10;
	double j;
	j=i;
	System.out.println(i);
	System.out.println(j);

		
		//	byte<short<int<long<double
	
	//	Norrowing /explicit <-
	System.out.println("Narrowing");
		double j2=10.2;
		int i2;
		//i2=j2;//needs type cast operator gives compile time error--loss of dATA
		i2 = (int) j2;
		System.out.println(i2);
		System.out.println(j2);

	byte n=65;
	char m ;
	m=(char)n;//try by char to byte changing -- compliation error if not type casted
	//boolean cannot be casted to any other data type and vice versa
	System.out.println(m);
	System.out.println(n);
	
	
	}
}
