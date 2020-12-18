package Java_Basic;

public class string_concate 
{
	public static void main(String[] args) 
	{
        System.out.println("This is my JAVA code an i am happy");
        
        String x ="Hello";
        String y ="World";
        
        System.out.println(x+y);
        
        int a =100;
        int b=200;
        
        System.out.println(a+b);
        
        double c = 12.33;
        double d =23.44;
        
        System.out.println(c+d);
        
        System.out.println(a+b+x+y);  //300helloworld
        System.out.println(x+y+a+b);  //helloworld100200
        System.out.println(x+y+(a+b));  //helloworld300
        System.out.println(a+b+c+d+x+y);  //335.77HelloWorld
        System.out.println(a+b+x+y+c+d);   //300HelloWorld12.3323.44
        
        System.out.println(20/10);
        System.out.println(3*4);
        
        int g =10;
        System.out.println(g/2);
       // System.out.println(g/0);  //ArithmeticException:
        System.out.println(0/10);
        System.out.println(10/2);
        System.out.println(5/2);
        System.out.println(5/2.0);
        System.out.println(5.0/2.0);
        System.out.println(5%2);   ///1
        System.out.println(20%4);  //0
        System.out.println(20%3);  //2
	}

}
