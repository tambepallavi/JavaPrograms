/*
 * Question 3: Try to print the following pattern on the console:
n = 4
n = 3
n = 2
n = 1
n = 0
 */
package Java_HomeWork;

public class Array_Assignment3 
{

	public static void main(String[] args)
	{
	  int a[]=new int[5];
	  a[0]=4;
	  a[1]=3;
	  a[2]=2;
	  a[3]=1;
	  a[4]=0;
	  
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.println("n = "+a[i]);
	  }
	  
	 

	}

}
