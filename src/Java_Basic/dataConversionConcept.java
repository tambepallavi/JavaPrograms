package Java_Basic;

import javax.swing.plaf.SliderUI;

public class dataConversionConcept
{
	public static void main(String[] args) 
	{
		//String to integer
       String x ="100";
       
       System.out.println(x+20);
       
       int i = Integer.parseInt(x);
       System.out.println(i+20);
       
       System.out.println("**************************");
       String y = "100A";
       String y1 = y.substring(0, 3);
       int y3 = Integer.parseInt(y1);
       System.out.println(y3 + 20);
       
      String y4[]= y.split("A");
      
      System.out.println(y4.length);
      
     // int y5 = Integer.parseInt(y4);
       
       //String to double
       String d = "12.33";
       double d1 = Double.parseDouble(d);
       System.out.println(d1);
       System.out.println(d1+22);
       
      //int to string
       int s = 100;
       System.out.println(s);
       System.out.println(s+ " "+20);
       
       String g =String.valueOf(s);
       System.out.println(g+20);
	}

}
