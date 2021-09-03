package practice;

public class Rectangle {
	  //Implement your code here    
    public float length;
    public float width;
    public double calculateArea(){
        double area = length*width;
        return area;
        
    }
    public double calculatePerimeter(){
        double peri = 2*(length+width);
        return peri;
    }
    public double getArea(){
        double a = calculateArea();
        return a;
    }
  public double getPerimeter(){
        double b = calculatePerimeter();
        return b;
    }
}
