package Java_Basic;

public class While_condition
{

	public static void main(String[] args) 
	{
		
		int i = 0;
		while (i<=10) 
		{
			System.out.println(i); //0,1,2,3,...10
			i++;
		}
		
		System.out.println("-------------------------------");

		int j =1;
		while(j<=10)
		{
			j++;
			System.out.println(j);  //2,3,4.....11 because we increament the value first and after we print the value
		}
		
		System.out.println("-----------------------------");
		int k =10;
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
		
		System.out.println("-------------------------------");
		int array[] = {1,11,22,33};
		int p=0;
		while(p<4)
		{
			System.out.println(array[p]);
			p++;
		}
		
		System.out.println("=------------------------------");
		int arr[] = {1,2,3,4};
		int q=3;
		while(q>0)
		{
			System.out.println(arr[q]);
			q--;
		}
		
		System.out.println("--------------------------");
		int num=3;
		int i1=1;
		while(i1<=10)
		{
			System.out.println("Tables 2: " +num*i1);
			i1++;
		}
		
		System.out.println("-------------------------");
		int n1 =1;
		int n2=1;
		while(n1<=10)
		{
			System.out.println("table 1 "+n1*n2);
			n1++;
		}
		
		System.out.println("-----------------------------");
		
		int t=2;
		int t1=1;
		while(t1<=10)	
		{
			System.out.println("multiply by 2 is  "+t*t1);
			t1++;
		}
	}

}
