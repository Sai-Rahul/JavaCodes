import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CollectionDemoList 
{

	public static void main(String[] args) 
	{
		List <Integer> values = new ArrayList<>();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2);
		
		for(Object o : values)
		{
			System.out.println(o);
		}
	}

}
