package OOP_Abstract;

public class LoginPage extends page
{
    public LoginPage() 
    {
		System.out.println("LP.....constructor");
	}
	@Override
	public void header() 
	{
		System.out.println("LP.....header");

	}

	@Override
	public void footer() 
	{
		System.out.println("LP....Footer");

	}

	@Override
	public void title()
	{
		System.out.println("LP .... Title");
	}
	
	public void DoLogin(String ur ,String psw)
	{
		System.out.println("LP.....DoLogin");
		System.out.println("LP....."+ur+ " "+psw);
	}
	
	

}
