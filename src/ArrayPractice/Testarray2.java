package ArrayPractice;

public class Testarray2 
{
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
        printArray(new int[] {10,20,30});
	}

}
