package training;

import java.util.HashMap;

public class MapHash {
		public static void main(String[] args) {
      HashMap <Integer, String> hm= new HashMap <Integer, String>();
      MapHash mh= new MapHash();
     mh.add(hm);
     mh.SearchKey(hm, 5);
            
	}
void add(HashMap<Integer, String> m)// to add values ot hash map
{
	m.put(1, "Max");
	m.put(2, "Has");
	m.put(4, "Car");
	m.put(3, "Black");
	m.put(5, "Dog");
	System.out.println(m);
	}

void SearchKey(HashMap<Integer, String> m, int n)// to search for value by the key
{
	if(m.containsKey(n))
	{
		System.out.println("Value of that key is "+ m.get(n));
	}
}


}
