//Write a program to verify a word or a character contained in the sentence.
package Java_HomeWork;

public class StringManupulationAssignment4
{
	public static void main(String[] args) 
	{
       String str = "I am automation Tester";
       
       if(str.contains("automation"))
       {
    	   System.out.println("The word automation is present");
       }
       else
       {
    	   System.out.println("The word automation is not present");
       }
	}

}
