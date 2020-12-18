package StringPackage;

public class endWith_function 
{
	public static void main(String[] args) 
	{
		String s1= "Java by JavaPoint";
		System.out.println(s1.endsWith(s1));
		System.out.println(s1.endsWith("point"));
		System.out.println(s1.endsWith("JavaPoint"));

	}

}
