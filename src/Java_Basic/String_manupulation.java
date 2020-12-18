package Java_Basic;

public class String_manupulation 
{

	public static void main(String[] args) 
	{
      //replace
		String dob ="14-04-1991";
		System.out.println(dob.replace("-", "/"));
		
		String str = "  Hello World  ";
		System.out.println(str.trim());
		System.out.println(str.trim().replace(" ", ""));
		System.out.println(str.trim().replace(" ", "JAVA"));
		
		//need to replace (&quot;) with (\")
		String andReplace = "&quot;";
		System.out.println(andReplace.replace("&quot;", "\""));
		System.out.println(andReplace.replaceAll("quot;","\\\\"+"\""));
		
		//split
		String lang="Java_Pythan_JavaScript_Ruby";
		String langPro[] = lang.split("_");
		System.out.println(langPro.length);
		
		for(int i = 0;i<langPro.length;i++)
		{
			System.out.println(langPro[i]);
		}
		
		String country = "INDIA,UK,USA,CANADA";
		String countryList[] = country.split(",");
		System.out.println(countryList.length);
		
		for(int j=0;j<countryList.length;j++)
		{
			System.out.println(countryList[j]);
		}
		
		String test = "xXSeleniunxXxTestingXxXAutomation";
		String testline[] = test.split("xX");
		System.out.println(testline[0]);  //blank space
		System.out.println(testline[1]);  //Selenium
		System.out.println(testline[2]);  //xTestX
		System.out.println(testline[3]);  //Automation
		
		//suString
		String info = "Your Transaction id is 1234";
		System.out.println(info);
		//System.out.println(info.substring(22));
		//System.out.println(info.substring(0, 4));
		//System.out.println(info.substring(info.indexOf("is")+3, info.length()));
		//System.out.println(info.substring(info.indexOf("is")+3));
		System.out.println(info.split(" ")[4]);
		
	}

}
