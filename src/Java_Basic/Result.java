package Java_Basic;

public class Result {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int totalMark =10;
		//int mark=100;
			
		if(totalMark<=100)
		{
			if(totalMark>=80 && totalMark<=100)
			{
				System.out.println("distiction");
			}
			else if(totalMark>=60 && totalMark<=79)
			{
				System.out.println("first class");
			}
			else if(totalMark>=50 && totalMark<=59)
			{
				System.out.println("second class");
			}
			else if(totalMark>=35 && totalMark<=49)
			{
				System.out.println("Third class");
			}
			else
			{
				System.out.println("fail");
			}
		}
		else
		{
			System.out.println("The Number is not correct");
		}
		}


}
