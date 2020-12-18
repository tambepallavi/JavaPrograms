//Define a method that returns the product of two numbers entered by user.
package Java_HomeWork;

public class method_assignmet2 
{
	public int getMultiply(int n1,int n2)
	{
		int result = n1*n2;
		System.out.println("The result is "+result);
		return 0;
		
	}
	public static void main(String[] args) 
	{
		method_assignmet2 mul=new method_assignmet2();
		mul.getMultiply(2, 6);
		mul.getMultiply(50, 20);

	}

}
