/*
 * 1. Take three numbers from the user and print the greatest number. 
Test Data
Input the 1st number: 25 
Input the 2nd number: 78 
Input the 3rd number: 87
Expected Output :
The greatest: 87
 */
package Java_HomeWork;

public class Conditonal_Operator {

	public static void main(String[] args)
	{
		int num1 =25;
		int num2 =78;
		int num3= 87;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("The Greatest :" +num1);
		}
		else if(num2>num3)
		{
			System.out.println("The Greatest :" +num2);
		}
		else
		{
			System.out.println("The Greatest :" +num3);
		}

	}

}
