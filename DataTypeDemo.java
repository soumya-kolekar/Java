package DayOne;

public class DataTypeDemo {

    //The method converts temperature from one unit to another
    public static void main(String[] args) {
        double fahrenheit = 212.0;      // Input in Fahrenheit

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);     // conversion from fahrenheit to celsius
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
        //Write code here to convert temperature to Kelvin 

        double  kelvin =((( 5 *(fahrenheit - 32.0)) / 9.0)+(273.15));     // conversion from fahrenheit to kelvin
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + kelvin + " in Kelvin");
        
        
    }
}
