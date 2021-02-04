class G
{ 
	final int i; // once we make a variable we cannot change it
	public G()
	{
		 i= 10;
		
	}
}


public class FinalDemo 
{

	public static void main(String[] args) 
	{
 		
      G obj = new G();
       System.out.println(obj.i);
	}

}
