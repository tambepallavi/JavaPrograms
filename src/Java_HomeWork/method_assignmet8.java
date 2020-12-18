/*
 * Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
 * Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40       Fail
 */
package Java_HomeWork;

public class method_assignmet8 
{
	public static void getRestul(double mark)
	{
		if(mark>=91 && mark<=mark)
		{
			System.out.println("Marks  "+mark +" Grade AA" );
		}
		else if(mark>=81 && mark<=90)
		{
			System.out.println("Marks  "+mark +" Grade AB" );
		}
		else if(mark>=71 && mark<=80)
		{
			System.out.println("Marks  "+mark +" Grade BB" );
		}
		else if(mark>=61 && mark<=70)
		{
			System.out.println("Marks  "+mark +" Grade BC" );
		}
		else if(mark>=51 && mark<=60)
		{
			System.out.println("Marks  "+mark +" Grade CD" );
		}
		else if(mark>=41 && mark<=50)
		{
			System.out.println("Marks  "+mark +" Grade CD" );
		}
		else if(mark<=40 && mark>=0)
		{
			System.out.println("Marks  "+mark +" Fail" );
		}
		else
		{
			System.out.println("Please enter the correct number");
		}
	}
	public static void main(String[] args)
	{
          getRestul(92);
          getRestul(81);
          getRestul(74);
          getRestul(67);
          getRestul(55);
          getRestul(44);
          getRestul(41);
          getRestul(40);
          getRestul(39);
          getRestul(100);
          getRestul(0);
          getRestul(-1);
          
	}

}
