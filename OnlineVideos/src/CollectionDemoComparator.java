import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemoComparator 
{

	public static void main(String[] args) 
	{
		List <Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		Comparator <Integer> c = new Comparator<Integer>()
				{
			      public int compare(Integer i, Integer j)
			      {
			    	  if(i%10>j%10)
			    		  return 1;
			    	  else
			    		  return -1;
			      }
				};
		
		Collections.sort(values, c);
		
		for(Object o : values)
		{
			System.out.println(o);
		}

	}

}
