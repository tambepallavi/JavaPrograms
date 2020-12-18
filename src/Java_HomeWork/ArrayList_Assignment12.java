//Write a Java program to print all the elements of a ArrayList using the position of the elements
package Java_HomeWork;

import java.util.ArrayList;

public class ArrayList_Assignment12 
{

	public static void main(String[] args) 
	{
	   ArrayList<String> progLang = new ArrayList<String>();
	   progLang.add("JAVA");
	   progLang.add("C");
	   progLang.add("C++");
	   progLang.add("VB");
	   progLang.add("JavaScript");
	   progLang.add(".net");
	   
	   progLang.indexOf(0);
	   
	  // System.out.println(progLang);
	   for(int i = 0;i<progLang.size();i++)
	   {
		   System.out.println(i+" "+progLang.get(i));
	   }
	   

	}

}
