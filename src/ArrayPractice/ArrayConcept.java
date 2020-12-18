package ArrayPractice;

public class ArrayConcept 
{
	public static void main(String[] args) 
	{
       int i[]= new int[4];
       i[0]=10;
       i[1]=20;
       i[2]=30;
       i[3]=40;
       
       System.out.println(i[0]);
       System.out.println(i[1]);
       System.out.println(i[2]);
      // System.out.println(i[4]);  //ArrayIndexOutOfBoundsException
      // System.out.println(i[-1]);   ////ArrayIndexOutOfBoundsException
       
       System.out.println(i.length);
       
       int len =i.length;
       System.out.println("Array size is: "+len);
       System.out.println("Li is: "+0);
       System.out.println("Hi is: "+(len-1));
       
       for(int k=0;k<i.length;k++)
       {
    	   System.out.println(i[k]);
       }
       
       double j[] =new double[2];
       j[0]=22.33;
       j[1]=44.55;
       
       System.out.println(j[0]);
       
       System.out.println(j[0]+j[1]);
       
       int marks[]=new  int [4];
       marks[0]=50;
       System.out.println(marks[0]);
       System.out.println(marks[1]);
       System.out.println(marks[2]);
       System.out.println(marks[3]);
      // System.out.println(marks[4]);  //ArrayIndexOutOfBoundsException
	}

}
