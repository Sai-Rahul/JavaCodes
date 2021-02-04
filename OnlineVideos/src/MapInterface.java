import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<>();
		map.put("Myname", "Rahul");
		map.put("actor", "Prabhas");
		map.put("CEO", "Sai");
		map.put("actor", "Prabhu");
		
		Set<String> keys = map.keySet(); 	
		
		for (String key : keys)
		{
			System.out.println(key + "  "+ map.get(key));
		}
	}

}
