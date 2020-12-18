//Write a Java program to retrieve an element (at a specified index) from a given array list.
package Java_HomeWork;

import java.util.ArrayList;

public class ArrayList_Assignment3 
{

	public static void main(String[] args) 
	{
		ArrayList<String> Fruits = new ArrayList<String>();
		Fruits.add("Watermelon");
		Fruits.add("Apple");
		Fruits.add("Banana");
		Fruits.add("Greaps");
		Fruits.add("Pineapple");
		Fruits.add("Orange");
		
		for(int i=0;i<Fruits.size();i++)
		{
			System.out.println(Fruits.get(i));
		}

	}

}
