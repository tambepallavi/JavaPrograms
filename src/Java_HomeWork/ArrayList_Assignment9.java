//Write a Java program of swap two elements in an array list.
package Java_HomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Assignment9 
{

	public static void main(String[] args) 
	{
		ArrayList<String> lang = new ArrayList<String>();
		lang.add("Marathi");  //0
		lang.add("Hindi");  //1
		lang.add("Gujarati"); //2
		lang.add("Punjabi");  //3
		lang.add("Kannad");   //4
		lang.add("Tamil");  //5
		
		//Before swap
		System.out.println("Before Swap "+"\n"+lang);
		
		//After swaping
		Collections.swap(lang, 2, 5);
		System.out.println("After Swap "+"\n"+lang);

	}

}
