/*
 * Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .
 */
package Java_HomeWork;

public class StringManupulationAssignment9 
{
	public static void main(String[] args) 
	{
       String str = "Pallavi;Tambe";
       String strgSlit[] =str.split(";");
      // System.out.println(strgSlit[0]);
      //System.out.println(strgSlit[1]);
       
       for(int i=0;i<strgSlit.length;i++)
       {
    	   System.out.println(strgSlit[i]);
       }
	}

}
