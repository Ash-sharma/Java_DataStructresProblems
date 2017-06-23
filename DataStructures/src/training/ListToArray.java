package training;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<String> AL= new ArrayList<String>();
		AL.add("max");
		AL.add("mo");
		AL.add("mx");
		AL.add("ax");
		ListToArray l= new ListToArray();
		l.ListtoArray(AL);

	}
	void ListtoArray(ArrayList<String> ar)
	{
		String a[] = new String[ar.size()];
		ar.toArray(a);
		for (int i=0; i<ar.size(); i++)
		{
		  		System.out.println(a[i]);
		}
		
	/*for (int i=0; i<ar.size(); i++)
	{
	  	a[i]= ar.get(i);
	  	System.out.println(a[i]);
	}*/
	
	}

}
