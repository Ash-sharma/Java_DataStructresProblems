package training;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map.Entry;

public class MapSort {

	public static void main(String[] args) {
		HashMap<Integer, String> hm =new HashMap<Integer, String>();
		hm.put(1, "max");
		hm.put(2, "nax");
		hm.put(5, "jax");
		hm.put(4, "rax");
		hm.put(3, "bax");
		MapSort ms = new MapSort();
		ms.SortByValue(hm);
		
	}
	void SortByValue(HashMap<Integer, String> m)// To sort map by values
	{
		Set<Entry<Integer,String>> nm= m.entrySet();
		LinkedList<Entry<Integer, String>> nl = new LinkedList<Entry<Integer,String>>(nm);
		Comparator<Entry<Integer, String>> c = new Comparator<Entry<Integer, String>>() {
			public int compare(Entry<Integer, String> a, Entry<Integer, String> b){
				String s1 = a.getValue();
				String s2= b.getValue();
						return s1.compareToIgnoreCase(s2);
			} 
		};
		Collections.sort(nl, c);
		LinkedHashMap<Integer, String> newMap = new LinkedHashMap<Integer, String>();
		for (Entry<Integer, String> e : nl)
		{
			newMap.put(e.getKey(),e.getValue());
		}
		for (Entry<Integer, String> e:newMap.entrySet() )
		{System.out.println(e.getKey()+ e.getValue());}
	}
}
