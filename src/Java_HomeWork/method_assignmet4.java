//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
package Java_HomeWork;
public class method_assignmet4 
{
	public static void getMaxiNum(int num1,int num2,int num3)
	{
		if(num1>num2 && num1>num3)
		{
			System.out.println("The maximaum number is "+num1);
		}
		else if(num2>num3)
		{
			System.out.println("The maximaum number is "+num2);
		} 
		else
		{
			System.out.println("The minimum number is "+num3);
		}
	}
	
	public static void getMinNum(int n1,int n2,int n3)
	{
		if(n1<n2 && n1<n3)
		{
			System.out.println("The Minumun number is "+n1);
		}
		else if(n2<n3)
		{
			System.out.println("The Minumun number is "+n2);
		}
		else
		{
			System.out.println("The Minumun number is "+n3);
		}
	}
	public static void main(String[] args) 
	{
		getMaxiNum(14, 6, 8);
		getMinNum(3, 7, 1);
	}

}
