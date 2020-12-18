//Write a Java program to remove the third element from a array list.
package Java_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Assignment5 
{

	public static void main(String[] args) 
	{
		ArrayList<String> lagList =new ArrayList<String>();
		lagList.add("Java");
		lagList.add("Python");
		lagList.add("Ruby");
		lagList.add("JavaScript");
		
		System.out.println("Before removing");
		System.out.println(lagList);
		
		lagList.remove(3);
		System.out.println("After removing");
		System.out.println(lagList);

	}

}
