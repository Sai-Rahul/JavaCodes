
public class WrapperDemo {

	public static void main(String[] args)
	
	{
         //int i=5; //primitive data type
         //Integer ii=new Integer(i); // Boxing or Wrapping
         
         //int j= ii.intValue() ; //unboxing - unwrapping
         
         //Integer value = i;  //Autoboxing or AutoWrapping
         
         //int k = value;   //Autounboxing
         
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
