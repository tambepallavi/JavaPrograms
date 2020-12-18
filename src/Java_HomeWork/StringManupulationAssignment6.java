//Write a program that gives you the last half of the string.
package Java_HomeWork;

public class StringManupulationAssignment6 
{
	public static void main(String[] args) 
	{
	   String str = "I love Testing";
	   System.out.println(str.substring(7));  //Testing
	   System.out.println(str.substring(str.indexOf("love")));  //love Testing
	   System.out.println(str.substring(str.indexOf("love")+5));  //Testing
	   System.out.println(str.substring(2, 6));  //love
	}

}
