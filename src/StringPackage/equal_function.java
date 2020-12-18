package StringPackage;

import java.util.ArrayList;

public class equal_function
{
	public static void main(String[] args) 
	{
		String s1="javatpoint";
		String s2="javatpoint";
		String s3 = "Javatpoint";
		
		System.out.println(s1.equals(s2));
		
		if(s1.equals(s3))
		{
			System.out.println("matchs");
		}
		else
		{
			System.out.println("not match");
		}
		
		String str = "Pallavi";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Prajakta");
		list.add("Neha");
		list.add("Jiya");
		list.add("Pallavi");
		
		for(String li:list)
		{
			if(li.equals(str))
			{
				System.out.println("name present");
			}
		
		}
	}

}
