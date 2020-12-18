package Java_Basic;

public class SwitchCaseStatement 
{
	public static void main(String[] args) 
	{
		String browser ="safari";

		switch (browser) 
		{
		case "chrome":
			System.out.println("Lunch chrome browser");
			break;

		case "Firefox":
			System.out.println("Lunch chrome Firefox");
			break;

		case "Safari":
			System.out.println("Lunch chrome Safari");
			break;

		case "IE":
			System.out.println("Lunch chrome IE");
			break;

		default:
			System.out.println("The browser not find " +browser);
			break;
		}

		System.out.println("#########################################");

		String studentName= "Sejals";
		int mark =-1;

		switch (studentName) 
		{
		case "Pranjal":
			mark=90;
			break;

		case "Shreya":
			mark=80;
			break;

		case "Kinjal":
			mark=50;
			break;

		case "Sejal":
			mark=0;
			break;

		default:
			System.out.println("Student not found");
			break;
		}
		System.out.println(studentName+"  has got "+mark);

		System.out.println("#########################################");

		int num =4;

		switch (num+2) 
		{
		case 1:
			System.out.println("Case 1 value is : "+num);
			//break;

		case 2:
			System.out.println("Case 2 value is : "+num);
			//break;

		case 3:
			System.out.println("Case 3 value is : "+num);
			//break;

		case 4:
			System.out.println("Case 4 value is : "+num);
			//break;
		default:
			System.out.println("Default value is : "+num);
			//break;
		}

		System.out.println("################ Find Vowels or Consonant ####################");

		char ch ='&';
		switch (ch) 
		{
		case 'a':
			System.out.println("Vowel : "+ch);
			break;

		case 'e':
			System.out.println("Vowel : "+ch);
			break;

		case 'i':
			System.out.println("Vowel : "+ch);
			break;

		case 'o':
			System.out.println("Vowel : "+ch);
			break;

		case 'u':
			System.out.println("Vowel : "+ch);
			break;

		case 'A':
			System.out.println("Vowel : "+ch);
			break;

		case 'O':
			System.out.println("Vowel : "+ch);
			break;

		case 'U':
			System.out.println("Vowel : "+ch);
			break;

		case 'I':
			System.out.println("Vowel : "+ch);
			break;

		case 'E':
			System.out.println("Vowel : "+ch);
			break;

		default:
			System.out.println("Consonant : "+ch);
			break;
		}


	}


}
