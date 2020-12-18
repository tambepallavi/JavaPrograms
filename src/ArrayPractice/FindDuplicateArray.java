//Program to print the duplicate elements of an array
package ArrayPractice;

public class FindDuplicateArray 
{

	public static void main(String[] args) 
	{
		
       int arr[]=new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
       
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    	       // System.out.println(arr[i]);
    		   if(arr[i]==arr[j])
    		   {
    			   System.out.println(arr[j]);
    		   }
    	   }
       }
	}

}
