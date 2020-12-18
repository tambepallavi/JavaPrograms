package Java_Basic;

import java.util.ArrayList;

public class ArratIndex {

	
		
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
					System.out.println("The element Apple is not in the ArrayList");
				else
					System.out.println("The element Apple is in the ArrayList at index " + index1);
				
				for(int i=0;i<Fruits.size();i++)
				{
				 System.out.println(Fruits.get(i)+" "+Fruits.indexOf(Fruits.get(i)));	
				}
				
				

			

		


	}

}
