//Write a Java program to empty an array list.
package Java_HomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Assignment10 
{

	public static void main(String[] args) 
	{
		ArrayList<String> sport =new ArrayList<String>();
		sport.add("Football");
		sport.add("Cricket");
		sport.add("Hockey");
		sport.add("Tenis");
		sport.add("Batmintan");
		
		//Full list
		System.out.println(sport);
		
		//sport.clear();
		sport.removeAll(sport);
		System.out.println(sport);
         
		

	}

}
