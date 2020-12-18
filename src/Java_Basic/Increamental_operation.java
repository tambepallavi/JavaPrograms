package Java_Basic;

public class Increamental_operation 
{

	public static void main(String[] args) 
	{
	  int x = 10;
	  int y = x++;
	  
	  System.out.println(x); //x= 10 its gives to y now y=10 and 10+1 = 11
	  System.out.println(y); //y 10
	  System.out.println(y++); //10
	  
	  int a =1;  //2
	  int b =a++; //1
	  
	  System.out.println(a);  //2
	  System.out.println(b);  //1
	  
	  int p = -1; //0
	  int q = p++; //-1
	  
	  System.out.println(p); //0
	  System.out.println(q); //-1
	  
	  int a1 = 10; //11
	  int b1 = ++a1;  //11  1+10
	  
	  System.out.println("a1  "+a1);// 11
	  System.out.println("b1  "+b1); //11
	  
	  int p1=2;
	  int q1=p1--;    //first give p1 value to the q1 thats why q1=2  and now q1 became 2 now so decrease the value from them now 2-1 =1 i. p1 =1
	  System.out.println(p1);  //1
	  System.out.println(q1);   //2
	  
	  int j =10;
	  int k =j--;
	  System.out.println(j); // 9
	  System.out.println(k);  //10
	  
	  int m= 10;  System.out.println(m);   //10
	  int n=20;   System.out.println(n);   //20
	  
	  System.out.println(m++ + n++);  //10+20 =30
	  System.out.println(m++ + ++n);  //10 + 1+1+20 =33

	  int x1 =2;
	  int y1 =--x1; // 1-2 =1
	  System.out.println("x1  "+x1);  //1
	  System.out.println("y1  "+y1);//1
	  
	  int t = -99;
	  int u= --t;
	  System.out.println("t  "+t);
	  System.out.println("u  "+u);
	  
	}

}
