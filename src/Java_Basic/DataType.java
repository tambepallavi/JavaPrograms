package Java_Basic;

public class DataType {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char c ='a';
		char d ='b';
		
		System.out.println(c+d);  //195
		
		int a = 2;
		int b = 4;
		
		String ab="hello";
		String cd="JAVA";
		String name= "Pallavi";
		System.out.println(name);
		
		System.out.println(a+b);   //6
		System.out.println(ab+cd); //helloJAVA
		System.out.println(a+b+ab+cd);  //6helloJAVA
		System.out.println(a+ab+b+cd);  //2hello4java
		System.out.println(ab+cd+a+b);  //hellojava24
		System.out.println(ab+cd+(a+b));  //hellojava6
		
		
		
		
				
	}

}
