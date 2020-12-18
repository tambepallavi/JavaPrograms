/* Design a University class template with the following features:
 variables:
name
country
stablishedDate
List of course provided in Array List<String>

--Design the constructor of this class with different parameters and all parameters.

--Write the get method of each variable with return keyword. 
 */
package Java_HomeWork;

import java.util.ArrayList;

public class Constructor_Assignment1 
{
	String name;
	String country;
	String stablishedDate;
	ArrayList<String> course;
	
	public Constructor_Assignment1(String name, String country, String stablishedDate, ArrayList<String> course)
	{
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.course = course;
	}
	

	public static void main(String[] args) 
	{
		ArrayList<String> course = new ArrayList<String>();
		course.add("Selenium");
		course.add("Jmeter");
		course.add("Data Science");
		course.add("Postman");
		course.add("Web Services");
		
		Constructor_Assignment1 courseList =new Constructor_Assignment1("Pallavi","India", "14/04/2020",course);
		System.out.println(courseList.name);
		System.out.println(courseList.country);
		System.out.println(courseList.stablishedDate);
		System.out.println(courseList.course);
		System.out.println(courseList.course.get(2));
		
		
		
	

	}

}
