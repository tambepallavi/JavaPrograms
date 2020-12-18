package StringPackage;

public class concat_function
{
	public static void main(String[] args) 
	{
		String s ="Java String";
		s.concat("is mutable");
		System.out.println(s);
		
		s=s.concat(" is immutable so assign it explicitly");
		System.out.println(s);

	}

}
