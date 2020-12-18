package Java_Basic;

public class StringManupulation
{

	public static void main(String[] args) 
	{
	   String str = "ddddfs This cd is my java code and i am so happy";
	   
	   System.out.println(str.length());
	   
	   System.out.println(str.charAt(0));
	   System.out.println(str.charAt(35));
	   
	  int s= str.indexOf("s");
	  System.out.println(s);
	  // System.out.println(str.indexOf("s"));
	   
	 //  System.out.println(str.charAt(str.length()));
	  // System.out.println(str.indexOf("s", 4));
	   
	   System.out.println(str.indexOf("s",str.indexOf("s")+1));
	   
	   
	   
	   

	}

}
