//Write a Java program to extract a portion of a array list.
package Java_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Assignment8 
{

	public static void main(String[] args) 
	{
		
       ArrayList<String> city =new ArrayList<String>();
       city.add("Mumbai");  //0
       city.add("Banglore"); //1
       city.add("Pune");  //2
       city.add("Chennai"); //3
       city.add("Kolkata");  //4
       
       //extract all list
       System.out.println(city);
       
       //extract 0 index to 1 index
       System.out.println(city.subList(0, 2));
       
       //extract 0 index to 3 index
       System.out.println(city.subList(0, 4));
       
       //extract 1 index to 2 index
       System.out.println(city.subList(1, 3));
       
       //extract 2 index to 4
       System.out.println(city.subList(2, 5));
	}

}
