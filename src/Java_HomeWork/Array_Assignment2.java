/**
 * Question 2: Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console
 */
package Java_HomeWork;

public class Array_Assignment2 
{

	public static void main(String[] args) 
	{
	   Object obj[] =new Object[6];
	   obj[0] ="Yuvraj";
	   obj[1]=38;
	   obj[2]="India";
	   obj[3]="12 December 1981";
	   obj[4]="male";
	   obj[5]=87.68;
	   
	   for(Object ob:obj)
	   {
		   System.out.println(ob);
	   }
	   
	   Object obj1[] =new Object[6];
	   obj1[0] ="Rohit Sharma";
	   obj1[1]=33;
	   obj1[2]="India";
	   obj1[3]="30 April 1987";
	   obj1[4]="male";
	   obj1[5]=137.68;
	   
	   for(Object ob1:obj1)
	   {
		   System.out.println(ob1);
	   }
	   
	  

	}

}
