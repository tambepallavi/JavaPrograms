package Java_Basic;

public class IncreamentalDecreamental 
{
	public static void main(String[] args) 
	{
		//Post Increament
       int a=1;
     //  int b=a+1;
       int b=a++;  //post increament
       System.out.println(a);
      // System.out.println(b); //2
       System.out.println(b);  //1
       //first give a's value to b that is b=a++ i.e b=1++ so b=1 
       //and a =1 then the increase value of a++ i.e 1+1 =2
       
       int c=-1;
       int d =c++;
       System.out.println(c);  //0
       System.out.println(d);  //-1
       
       int a1=2;
       int b1=a1++;
       System.out.println(a1);//  3
       System.out.println(b1);//  2
       
       int c1=0;
       int d1=c1++;
       System.out.println(c1); //1
       System.out.println(d1); //0
       
       int a2=-2;
       int b2=a2++;
       System.out.println(a2);  //-1
       System.out.println(b2);  //-2
       
       System.out.println(a2+b2); //-1+-2  ==-3
       
       //Pre increment
       int j=1;
       int k=++j;
       System.out.println(j);  //2 
       System.out.println(k);  //2
      // first increase the value of j ++j =1+1 =2 so k=2
     //  and after whole value give it to j so j=2
       
       int m=-5;  //-4
       int n=++m;  //-4
       
       System.out.println(m); 
       System.out.println(n);
       
       int m1=0;
       int n1=++m1;
       
       System.out.println(m1);  //1
       System.out.println(n1);  //1
       
       int j1=-1;
       int k1=++j1;
       
       System.out.println(j1);  //0
       System.out.println(k1);  //0
       
       //Post decrement
       int g=2;
       int h=g--;
       
       System.out.println(g); //1
       System.out.println(h);  //2
       
       int g2=0;
       int h2=g2--;
       System.out.println(g2);  //0
       System.out.println(h2);  //0
       
       int g1=1;
       int h1=g1--;
       System.out.println(g1); //0
       System.out.println(h1); //1
       
       //pre decrement
       int x=2;
       int y=--x;
       
       System.out.println(x); //1
       System.out.println(y);  //1
       
       int t=-99;
       int u=--t;
       System.out.println(t);  //-100
       System.out.println(u);  //-100
       
       int t1=1;  // 0
       int u1=--t1;  //0
       System.out.println(t1);
       System.out.println(u1);
	}

}
