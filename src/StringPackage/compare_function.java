package StringPackage;

public class compare_function 
{
	public static void main(String[] args) 
	{
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";
		String s6="";
		
		//the chars are alphabetically compare
		System.out.println(s1.compareTo(s2));  //0 because both are equal  
		System.out.println(s1.compareTo(s3)); // -5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4)); //-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5)); //2 because "h" is 2 times greater than "f" 
		System.out.println(s1.compareTo(s6));
		
		System.out.println("*******************************");
		
		System.out.println(s2.compareTo(s1));
		System.out.println(s2.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareTo(s4));
		System.out.println(s2.compareTo(s5));

	}

}
