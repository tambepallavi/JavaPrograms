package OOP_Abstract;

public class HomePage extends page
{

	@Override
	public void header()
	{
		System.out.println("HP.....header");
	}

	@Override
	public void footer() 
	{
		System.out.println("HP.....Footer");
	}
	
	public void accountInfo()
	{
		System.out.println("HP.....Account Info");
	}

}
