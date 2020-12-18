//Write a Java program to trim the virtual capacity of an array list the current list size.
package Java_HomeWork;

import java.util.ArrayList;

public class ArrayList_Assignment11 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<Integer>(9); 
		  
        // using add(), add 5 values 
        arr.add(2); 
        arr.add(4); 
        arr.add(5); 
        arr.add(6); 
        arr.add(11); 
  
        // trims the size to the number of elements 
         arr.trimToSize(); 
  
        System.out.println("The List elements are:"); 
  
        // prints all the elements 
        for (Integer number : arr) { 
            System.out.println("Number = " + number); 
        } 

	}

}
