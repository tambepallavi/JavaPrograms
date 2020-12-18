//Write a Java program to insert an element into the array list at the first and last positions
package Java_HomeWork;

import java.util.ArrayList;

public class ArrayList_Assignment2 
{

	public static void main(String[] args) 
	{
		ArrayList<String> columName =new ArrayList<String>();
		columName.add("Name");
		columName.add("Age");
		
		System.out.println(columName);
		
		columName.add(0, "Id");
		
		System.out.println(columName);  //added value in first position
		
		columName.add(columName.size(), "Gender");
		
		System.out.println(columName);  //added value in last position
		
		columName.add(2, "Birth Date");
		
		System.out.println(columName);  //added value at 1th index

	}

}
