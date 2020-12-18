package Java_Basic;

public class reverseNumber 
{
	public static void main(String[] args) 
	{
       String name ="pallavi";
       char ch[]=name.toCharArray();
      // int nameCount=ch.length;
       String rev ="";
       
       for(int i=ch.length-1;i>=0;i--)
       {
    	   rev+=ch[i];  
       }
       System.out.println(rev);
    }
	

}
