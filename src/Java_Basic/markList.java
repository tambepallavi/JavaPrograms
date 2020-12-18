package Java_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class markList 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> mark = new ArrayList<Integer>();
		mark.add(200); //0
		mark.add(300);  //1
		mark.add(100);  //2
		mark.add(400);  //3
		
		System.out.println(mark);  //[200, 300, 100, 400]
		System.out.println(mark.size());
		
		mark.add(0, 2);  //replace
		System.out.println(mark);  //[2, 100, 200, 300, 400]
		
		Collections.sort(mark);  //sort
		System.out.println(mark);  //[100, 200, 300, 400]
		
		Collections.swap(mark, 0, 2);  //swap
		System.out.println(mark);  //[300, 200, 100, 400]
		
		mark.remove(0); //remove 0th position
		System.out.println(mark);
		
		//mark.removeAll(mark);
		//System.out.println(mark);
		
		List<String> langList =  Arrays.asList("JAVA","Python","Ruby","Javascripts");
		System.out.println(langList);
		System.out.println(langList.size());
		
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Green");
		
		System.out.println(colorList);
		colorList.add(0, "White");
		colorList.add(colorList.size(), "Black");
		colorList.add(1, "blue");
		System.out.println(colorList);
		
	    colorList.add(0, "Yellow");
	    System.out.println(colorList);
	    
	    ArrayList<String> countryList =new ArrayList<String>();
	    countryList.add("India");
	    countryList.add("USA");
	    countryList.add("UK");
	    
	    System.out.println(countryList);
	    colorList.addAll(countryList);
	    System.out.println(colorList);
	    System.out.println(countryList);
	    
	    for(String str : countryList)
	    {
	    	System.out.println(str);
	    	if(str.equalsIgnoreCase("USA"))
	    	{
	    		//countryList.add("Canada");
	    		System.out.println("I am Indian");
	    	}
	    }

	}

}
