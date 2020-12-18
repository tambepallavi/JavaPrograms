/*
 * get only numeric part from this String:
String s = "your transaction id is: 12345 and reference id is 34567";
 */
package Java_HomeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManupulationAssignment11 
{
	public static void main(String[] args)
	{
       String str = "your transaction id is: 12345 and reference id is 34567";
       String firstId = str.split(" ")[4];
       String secondId = str.substring(str.length()-5);
       System.out.println(firstId+" "+ secondId);
       // System.out.println(str.substring(str.indexOf("is")+3));
       // System.out.println(str.substring(str.indexOf("is")+3, str.length()));
      //  System.out.println(str.substring(str.length()-5));
      //  System.out.println(str.substring(str.indexOf("is")+3, str.length()-5));
          
       Pattern p= Pattern.compile("\\d+");
       Matcher m =p.matcher("your transaction id is: 12345 and reference id is 34567");
       while(m.find())
       {
    	  System.out.println(m.group()); 
       }
       
       
    // System.out.println(str.replace("\\s", ""));
     System.out.println(str.replaceAll("\\D", ""));
       
       
      
	}

}
