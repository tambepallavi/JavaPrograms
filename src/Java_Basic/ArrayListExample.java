package Java_Basic;

import java.util.ArrayList;

public class ArrayListExample
{
	public static void main(String[] args) 
	{
       ArrayList arr =new ArrayList();
       System.out.println(arr.size());
       
       arr.add(100);
       arr.add(200);
       
       System.out.println(arr);
       
       System.out.println(arr.size());
       
       arr.add(300);
       arr.add(400);
       
       System.out.println(arr.size());
       
       arr.add(true);
       arr.add("Selenium");
       arr.add('P');
       arr.add(30.23);
       
       System.out.println("******************************");
       System.out.println(arr.size());
       
   //   arr.add(0, 'p');
     // System.out.println(arr);
      // for(int i=0;i<arr.size();i++)
      // {
    	   System.out.println(arr);
       //}
    	   
    	   System.out.println(arr.get(0));
    	   System.out.println(arr.get(7));
    	   
    	   arr.remove(0);
    	   System.out.println(arr.size());
    	   System.out.println(arr);
    	   
    	   System.out.println(arr.get(0));
    	   
    	   for(int i = 0;i<=arr.size()-1;i++)
    	   {
    		   System.out.println(arr.get(i));
    	   }
    	   
    	   ArrayList<String> StriArr=new ArrayList<String>();
    	   StriArr.add("Selenium");
    	   StriArr.add("TestNG");
    	   StriArr.add("Jmeter");
    	   
    	   for(String str: StriArr)
    	   {
    		   System.out.println(str);
    	   }
    	   
    	   
    	   
	}

}
