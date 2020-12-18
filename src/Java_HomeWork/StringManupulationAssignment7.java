/*
 * Write a program to get the 3rd  “ e “ of the string .
 For example: “Welcome to Naveen Automation Labs ! “
 */

package Java_HomeWork;

public class StringManupulationAssignment7 
{
	public static void main(String[] args) 
	{
       String str = "Welcome to Naveen Automation Labs ! ";
       int firstE = str.indexOf("e", str.indexOf("e")+1);
       
     //  System.out.println(str.indexOf("e"));
     //  System.out.println(str.indexOf("e", str.indexOf("e")+1));
         System.out.println(str.indexOf("to")+6);
	}

}
