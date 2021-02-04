interface Abc
{
	void show();
}

public class Anonymousclassinterface 
{
   public static void main(String args[])
   {
	   Abc obj= new Abc()
			   {
		          public void show()
		          {
		        	  System.out.println("I'm the best");
		          }
			   };
			   obj.show();
   }
}
