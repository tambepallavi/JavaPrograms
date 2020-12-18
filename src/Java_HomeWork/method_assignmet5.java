// Define a program to find out whether a given number is even or odd.
package Java_HomeWork;

public class method_assignmet5
{
	public static void getEvenOdd(int i)
	{
		if(i%2==0)
		{
			System.out.println("The entered number is Even "+i);
		}
		else
		{
			System.out.println("The entered number is Odd "+i);
		}
	}
	public static void main(String[] args) 
	{
        getEvenOdd(99);
        getEvenOdd(78);
	}

}
