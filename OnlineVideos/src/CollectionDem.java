import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class CollectionDem {

	public static void main(String[] args) 
	{
		Collection values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		
		Iterator it= values.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
