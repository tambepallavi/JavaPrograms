package OOP_Abstract;

public class TestPage 
{
	public static void main(String[] args) 
	{
        LoginPage lp =new LoginPage();
        lp.header();
        lp.footer();
        lp.title();
        lp.DoLogin("pallavi", "1234");
        
        page.logo();
        
        page p =new LoginPage();
        p.header();
        p.footer();
        p.title();
        
        //page p1 =new page();  ///Page is the abstract class we can not create object of abstract class
	}

}
