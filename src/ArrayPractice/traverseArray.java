package ArrayPractice;

public class traverseArray 
{

	public static void main(String[] args)
	{
      int i[]=new int[5];
      
      i[0]=10;
      i[1]=20;
      i[2]=20;
      i[3]=30;
      i[4]=40;
      
      int size=i.length;
      
      for(int j=0;j<size;j++)
      {
    	  System.out.println(i[j]);
      }
      
      for(int k:i)
      {
    	  System.out.println(k);
      }
	}

}
