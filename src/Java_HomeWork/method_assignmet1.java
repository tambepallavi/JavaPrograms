//Write a program to print the sum of two numbers entered by user by defining your own method.
package Java_HomeWork;

public class method_assignmet1 
{
	public static void getSum(int num1,int num2)
	{
		int result = num1 +num2;
		System.out.println("The sum is " +result);
	}
	
	public int getSumResult(int n1 ,int n2)
	{
		int r = n1+n2;
		System.out.println("The sum is: "+r);
		return 0;
		
	}
	public static void main(String[] args) 
	{
         getSum(6, 2);
         getSum(30, 40);
         
         method_assignmet1 sum =new method_assignmet1();
         sum.getSumResult(2, 20);
         sum.getSumResult(100, 200);
	}

}
