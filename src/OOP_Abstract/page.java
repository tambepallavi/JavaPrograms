package OOP_Abstract;

public abstract class page 
{
   public abstract void header();
   public abstract void footer();
   
   public page()
   {
	   System.out.println("Page ....constrctor");
   }
   public void title()
   {
	   System.out.println("Page ....default Title");
   }
   
   public static final void logo()
   {
	   System.out.println("APP....Logo");
   }
}
