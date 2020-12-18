package Java_Basic;

public class for_loop {

	public static void main(String[] args)
	{
		int i=1;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("-------------------------------");
		
		for(i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("-------------EVEN----------------");
		
		for(int even =2;even<=10;even=even+2)
		{
			System.out.println(even);
		}
		
		System.out.println("-------------ODD ---------------");
		for(int odd=1;odd<=9;odd=odd+2)
		{
			System.out.println(odd);
		}
		
		System.out.println("--------------------------------");
		for(int j=10;j>=1;j--)
		{
			System.out.println(j);
		}
		
		System.out.println("--------------------------------");
		

	}

}
