package StringPackage;

public class contains_functionality
{
	public static void main(String[] args) 
	{
       String name ="what do you know about me";
       
       System.out.println(name.contains("do you know"));
       System.out.println(name.contains("what"));
       System.out.println(name.contains("about me"));
       System.out.println(name.contains("pallavi"));
       System.out.println(name.contains("Do you"));
       
       String str ="To learn Java visit Javatpoint.com";
       if(str.contains("Javatpoint.com"))
       {
    	   System.out.println("this is present");
       }
       else
       {
    	   System.out.println("this is not found");
       }
	}

}
