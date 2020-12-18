package Java_Basic;

public class ConditionalOperator 
{
	public static void main(String[] args) 
	{
         int i =100;
         int j =200;
         
         if(i>j)
         {
        	 System.out.println("i is greater than j");
         }
         else
         {
        	 System.out.println("j is greater than i");
         }
         
         if(i==100)
         {
        	 System.out.println("hey");
         }
         
         if(true)
         {
        	 System.out.println("Selenium");
         }
         else
         {
        	 System.out.println("QTP");
         }
         
         System.out.println("####################################################");
         
         int mark =200;
         if(mark>=100)
         {
        	 System.out.println("PASS");
         }
         
         String x="Selenium";
         String y ="Selenium";
         
         if(x.equals(y))
         {
        	 System.out.println("Both string are equal");
         }
         else
         {
        	 System.out.println("Both ar not equal");
         }
         
         System.out.println("####################################################");
         
         int billAmount =100;
         
         if(billAmount>=100)
         {
        	 if(billAmount<=200)
        	 {
        		 System.out.println("discount");
        	 }
         }
         
         System.out.println("####################################################");
         //marks
         
         int marks=101;
         if(marks<=100)
         { 
	         if(marks <=100 && marks>=70)
	         {
	        	 System.out.println("Distinction");
	         }
	         else if(marks <=69 && marks>=60)
	         {
	        	 System.out.println("A grade");
	         }
	         else if(marks<= 59 && marks>=40)
	         {
	        	 System.out.println("B grade");
	         }
	         else if(marks<=39 && marks>= 35)
	         {
	        	 System.out.println("C grade");
	         }
	         else
	         {
	        	 System.out.println("Fail");
	         }
         }
         else
         {
        	 System.out.println("Please pass the correct marks");
         }
         
         
         System.out.println("####################################################");
         
         //Greatest number
         int x1 =500;
         int y1 =700;
         int z1 =300;
         
         if(x1>y1 && x1>z1)
         {
        	 System.out.println("X is greatest ");
         }
         else if(y1>z1)
         {
        	 System.out.println("Y is greatest");
         }
         else
         {
        	 System.out.println("Z is greatest");
         }
         
         System.out.println("####################################################");
         
         //Find the same number
         int x2 = 200;
         int y2 = 200;
         int z2 = 200;
         
         if(x2==y2 && x2 ==z2)
         {
        	 System.out.println("XYZ values are same");
         }
         else if(x2==y2)
         {
        	 System.out.println("X and Y values are same");
         }
         else if(x2==z2)
         {
        	 System.out.println("X and Z values are same");
         }
         else if(y2==z2)
         {
        	 System.out.println("Y and z values are same");
         }
         
         System.out.println("####################################################");
         // Greater number from given 4 numbers
         
         int p =100;
         int q =0;
         int r = 30;
         int s =40;
         
         if(p>q && p>r && p>s)
         {
        	 System.out.println("P is greatst value "+p);
         }
         else if(q>r && q>s)
         {
        	 System.out.println("q is greatest value " +q);
         }
         else if(r>s)
         {
        	 System.out.println("r is greatest value  "+r);
         }
         else
         {
        	 System.out.println("s is greatest value "+s);
         }
         
         System.out.println("####################################################");
         //Greatest number
         int a =100;
         int b =0;
         int c =300;
         
         if(a<b && a<c)
         {
        	 System.out.println("a is smallest ");
         }
         
         else if(b<c)
         {
        	 System.out.println("b is smallest");
         }
         else
         {
        	 System.out.println("c is smallest");
         }
        	 
	}

}
