import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) 
	{
		Set<Integer> values = new TreeSet<>();
		//Set<Integer> values = new HashSet<>();// Replacing Hashset with TreeSet gives results in ascending order		
		System.out.println(values.add(87));
		System.out.println(values.add(97));
		System.out.println(values.add(34));
		System.out.println(values.add(92));
		
		for (int i : values)
		{
			System.out.println(i);
		}
		
		
	}

}
