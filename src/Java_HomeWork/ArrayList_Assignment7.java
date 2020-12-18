//Write a Java program to reverse elements in a array list
package Java_HomeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_Assignment7 
{

	public static void main(String[] args) 
	{		
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		System.out.println("List before reversing :\n" + list_Strings);  
		
		Collections.reverse(list_Strings);
		System.out.println("List after reversing :\n" + list_Strings); 
		
		//another list
		List<String> flowers = Arrays.asList("Rose","Tulip","Sunflower","Hibiscus");
		System.out.println("List before reversing :\n" + flowers);  
		
		Collections.reverse(flowers);
		System.out.println("List after reversing :\n" + flowers); 
	  
		

	}

}
