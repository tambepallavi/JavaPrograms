package StringPackage;

public class indexOf_function 
{
	public static void main(String[] args) 
	{
		String s1="this is index of example";
		//passing substring 
		System.out.println(s1.indexOf("is"));
		System.out.println(s1.indexOf("index"));
		
		//passing substring with from index 
		System.out.println(s1.indexOf("is", 4)); //passing substring with from index 
		System.out.println(s1.indexOf("index", 4));

	}

}
