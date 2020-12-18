//Write a program to print the circumference and area of a circle of radius entered by user 
//by defining your own method.Answer
package Java_HomeWork;

public class method_assignmet3
{
	//C = 2 pi r
	public static void getCircumference(double r)
	{
		double circum =2 * 3.14 * r;
		System.out.println("circumference is :"+circum);
	}
	
	//A = \pi r^2
	public static void getAreaOFCircle(double r)
	{
		double areaOfCircle = 3.14*r*2;
		System.out.println("Area of circle is :"+areaOfCircle);
	}

	public static void main(String[] args)
	{
       getCircumference(4);
       getAreaOFCircle(4);
	}

}
