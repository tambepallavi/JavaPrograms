/**
 * Write a Java program to print the result of the following operations. Change your test data accordingly.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5 + 15 / 3 * 2 - 8 % 3 
Expected Output :
43 
1 
19 
13
 */
package Java_HomeWork;

public class DataType_Assignment3 {

	public static void main(String[] args) 
	{
		int num1= -5, num2=8, num3=6;
		int num4=55,  num5 = 9;
		int num6 = 20,  num7=-3, num8=5;
		int num9=5,  num10=15,  num11=3,  num12=2;
        int result;
        
        result = num1+num2*num3;  //-5 + 8 * 6
        System.out.println("The result is "+result);
        
        result=(num4+num5) % num5;   //(55+9) % 9 
        System.out.println("The result is "+result);
        
        result=num6+num7*num8/num2;  //20 + -3*5 / 8 
        System.out.println("The result is "+result);
        
        result= num9+ num10/ num11 *num12 -num2% num11;  // 5 + 15 / 3 * 2 - 8 % 3 
        System.out.println("The result is "+result);
        
	}

}
