//A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
package Java_HomeWork;

public class method_assignmet6 
{
	public static void getEligibleForVoting(int age)
	{
		if(age>=18)
		{
			System.out.println("Your age "+ age + " is eligible for the voting");
		}
		else
		{
			System.out.println("Your age "+ age + " is not eligible for the voting");
		}
	}

	public static void main(String[] args) 
	{
         getEligibleForVoting(1);
         getEligibleForVoting(18);
         getEligibleForVoting(60);
         getEligibleForVoting(90);
         getEligibleForVoting(100);
         getEligibleForVoting(0);
	}

}
