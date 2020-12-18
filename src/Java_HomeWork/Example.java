package Java_HomeWork;

public class Example {

	public static void main(String[] args)
	{
		 //declaring a 2D array with odd columns  
        int arr[][] = new int[4][];  
        arr[0] = new int[10];  
        arr[1] = new int[10];  
        arr[2] = new int[10]; 
        arr[3] = new int[10];
        
        int count = 0;  
         
        for (int i=0; i<arr.length; i++)
        {  
            for (int j=0; j<arr[i].length; j++)
            {   
            	arr[i][j] = count++;
                System.out.print(arr[i][j]+" ");  
                
            }  
            System.out.println();//new line  
        }  
    }  

	

}
