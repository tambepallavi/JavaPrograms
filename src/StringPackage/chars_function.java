package StringPackage;

public class chars_function 
{

	public static void main(String[] args) 
	{
		String str = new String("hello javatpoint how r u");  
	      char[] ch = new char[10];  
	      try
	      {  
	         str.getChars(0, 5, ch, 0);  
	         System.out.println(ch);  
	      }
	      catch(Exception ex){System.out.println(ex);
	      }  
	

	}

}
