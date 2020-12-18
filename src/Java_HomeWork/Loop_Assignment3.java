
//3. WAP to print 10 to 1 using for, while and do-while loop
package Java_HomeWork;

public class Loop_Assignment3 {

	public static void main(String[] args) 
	{
		System.out.println("Using a while loop");
		
		int i=10;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
		System.out.println("Using Do-while loop");
		int j=10;
		do
		{
			System.out.println(j);
			j--;
		}
		while(j>=1);
		
		System.out.println("useing FOR loop");
		for(int k=10;k>1;k--)
		{
			System.out.println(k);
		}

	}

}
