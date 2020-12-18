//5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
package Java_HomeWork;

public class Loop_Assignment5 {

	public static void main(String[] args) 
	{

		int i = 1;

		while (i <= 10) 
		{
			System.out.println(i);

			if (i== 7) 
			{
				break;
			}

			i++;
		}

	}

}
