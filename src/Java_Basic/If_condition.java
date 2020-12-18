package Java_Basic;

public class If_condition {

	public static void main(String[] args)
	{
		//write a program to find highest number of the given number
		int a =510;
		int b =500;
		int c =300;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater than b and c ");
		}
		else if(b>c)
		{
			System.out.println("b is grater than c aand a");
		}
		else
		{
			System.out.println("c is greter than a and b");
		}
		
		// 2 values
		int p =700;
		int q=200;
		if(p>q)
		{
			System.out.println("p is greter than q");
		}
		else
		{
			System.out.println("q is greater than p");
		}
		
		//highest number from gien 4 values
		int w =500;
		int x =700;
		int y =800;
		int z= 400;
		
		if(w>x && w>y && w>z)
		{
			System.out.println("w is greatahn any of");
		}
		else if(x>y && x>z)
		{
			System.out.println("x is greater value");
		}
		else if(y>z)
		{
			System.out.println("y is greater value");
		}
		else
		{
			System.out.println("z is greater value");
		}
		
		//find the same no from given 3 no.
		
		int m = 1000;   //m=t , m=n , n=t
		int n = 700;
		int t =100;
		
		if(m==n && m==t)
		{
			System.out.println("3 valus are same");
		}
		else if(m==n)
		{
			System.out.println("m and n are same");
		}
		else if(m==t)
		{
			System.out.println("m and t are smae");
		}
		else if(n==t)
		{
			System.out.println("n and t same");
		}
		else
		{
			System.out.println("all values are diffrent");
		}
		

	}

}
