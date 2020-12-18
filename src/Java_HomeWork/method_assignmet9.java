package Java_HomeWork;

public class method_assignmet9 
{
	public static void getFactorialNum(int number)
	{
		int fact=1;     
		
		for(int i=1;i<=number;i++)
		{    
		    fact=fact*i;    
		}    
		System.out.println("Factorial of "+number+" = "+fact);  
	}
	
	public int getNum(int num)
	{
		int fact1 =1;
		for(int j=1;j<=num;j++)
		{
			fact1=fact1*j;
		}
		System.out.println("Factorial number is  "+num+" = "+fact1);
		return num;
		
	}
	public static void main(String[] args) 
	{
		getFactorialNum(5);
		getFactorialNum(3);
		getFactorialNum(20);
		getFactorialNum(12);
		
		method_assignmet9 fa =new method_assignmet9();
		fa.getNum(3);
		fa.getNum(5);
	}
	
	

}
