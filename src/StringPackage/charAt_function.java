package StringPackage;

public class charAt_function 
{
	public static void main(String[] args)
	{
       char[] ch = {'j','a','v','a'};
       String s = new String(ch);
       System.out.println(s);
       
       String str = "Javascript";
       char chStr = str.charAt(3);
       System.out.println(chStr);
       System.out.println(str.charAt(1));
       System.out.println(str.charAt(5));
      // System.out.println(str.charAt(11)); //StringIndexOutOfBoundsException
       
       //fetch the first char and last char
       String str1 = "Welcome to Javatpoint portal"; 
       int charSize = str1.length();
       System.out.println(charSize);
       
       //first char
       System.out.println(str1.charAt(0));
       
       //last char
       System.out.println(str1.charAt(str1.length()-1));
       System.out.println(str1.charAt(charSize-2));
       
       System.out.println("***************charactor present on odd index position**********************");
       for(int i =0;i<str1.length()-1;i++)
       {
    	   if(i%2!=0)
    	   {
    		   System.out.println(i+ " "+str1.charAt(i));
    	   }
       }
       
       System.out.println("*************** charactor present at even index position");
       for(int j=0;j<str1.length()-1;j++)
       {
    	   if(j%2==0)
    	   {
    		   System.out.println("Even Indext -"+j+ " charactor is :-"+str1.charAt(j));
    	   }
       }
       
       int count =0;
       for(int k=0;k<str1.length()-1;k++)
       {
    	   if(str1.charAt(k)=='t')
    	   {
    		   count++;
    	   }
       }
       System.out.println("T count is :"+count);
       
       int countA=0;
       for(int k1 = 0;k1<str1.length()-1;k1++)
       {
    	   if(str1.charAt(k1)=='a')
    	   {
    		  
    		   countA++;
    		   
    	   }
       }
       System.out.println(countA);
	}

}
