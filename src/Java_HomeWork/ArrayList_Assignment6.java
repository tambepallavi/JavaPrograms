//Write a Java program to search an element in a array list.
package Java_HomeWork;

import java.util.ArrayList;

public class ArrayList_Assignment6 
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

		System.out.println(Fruits);
		System.out.println(Fruits.indexOf("Banana"));

		int index1 = Fruits.indexOf("Apple");
		//int index2 = Fruits.indexOf("Orange");

		if(index1 == -1)
			System.out.println("The Apple is not in the ArrayList");
		else
			System.out.println("The Apple is in the ArrayList at index " + index1);
		
		for(int i=0;i<Fruits.size();i++)
		{
			//System.out.println(Fruits.get(i));
			if(Fruits.get(i).equals("Orange"))
			{
				System.out.println("Orange is present");
			}
		}
		
		
		

	}

}
