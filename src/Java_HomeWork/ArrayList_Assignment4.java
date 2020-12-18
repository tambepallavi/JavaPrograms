//Write a Java program to update specific array element by given element.
package Java_HomeWork;

import java.util.ArrayList;

public class ArrayList_Assignment4
{

	public static void main(String[] args)
	{
		ArrayList<Integer> arrlst =new ArrayList<Integer>();
		arrlst.add(100);
		arrlst.add(200);
		arrlst.add(300);
		arrlst.add(400);
		
		System.out.println("Before updating");
		System.out.println(arrlst);
		
		System.out.println("After Updating");
		//update elemnts
		arrlst.set(0, 150);   
		arrlst.set(1, 250);
		arrlst.set(2, 350);
		arrlst.set(3, 450);
		System.out.println(arrlst);  
	}

}
