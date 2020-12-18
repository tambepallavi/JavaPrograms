/**
 * 
2. WAP to print following output:
I am Batman 1
I am Batman 2
.
.
.
I am Batman 9
 */

package Java_HomeWork;

public class Loop_Assignment2 {

	public static void main(String[] args) 
	{
		System.out.println("Using a For loop");
		
		for(int i=1;i<10;i++)
		{
			System.out.println("I am Batman "+i);
		}
		
		System.out.println("Using a while loop");
		
		int j=1;
		while(j<10)
		{
			System.out.println("I am Batman  "+j);
			j++;
		}

	}

}
