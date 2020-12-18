/*
 * Remove all  spaces in a String . 
 
  For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
 */
package Java_HomeWork;

public class StringManupulationAssignment2
{
	public static void main(String[] args) 
	{
       String str = "         Hello      Everyone       ";   
      // System.out.println(str.trim());
       System.out.println(str.trim().replace("  ", ""));   //Expected result: “HelloEveryone”
    		   
	}

}
