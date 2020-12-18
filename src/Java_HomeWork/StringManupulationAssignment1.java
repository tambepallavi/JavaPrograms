//Write a program to check two different strings equality.
package Java_HomeWork;

public class StringManupulationAssignment1 
{

	public static void main(String[] args) 
	{
      String str1 = "I love Automation";
      String str2 = "I love automation";
      
      //using equals
      System.out.println("using equals: -");
      if(str1.equals(str2))
      {
    	  System.out.println("Strings are match");
      }
      else
      {
    	  System.out.println("Strings are not match");
      }
      
      //using equalsIgnoreCase
      System.out.println("using equalsIgnoreCase : -");
      if(str1.equalsIgnoreCase(str2))
      {
    	  System.out.println("Strings are match");
      }
      else
      {
    	  System.out.println("Strings are not match");
      }
	}

}
