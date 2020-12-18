//Write a Java program to create a new array list, add some colors (string) and print out the collection
package Java_HomeWork;

import java.util.ArrayList;

public class ArrayList_Assignment1
{

	public static void main(String[] args) 
	{
		ArrayList<String> color =new ArrayList<String>();
		color.add("White");
		color.add("Pink");
		color.add("Purple");
		color.add("blue");
		
		System.out.println(color);
		
		for(String co :color)
		{
			System.out.println(co);
		}

	}

}
