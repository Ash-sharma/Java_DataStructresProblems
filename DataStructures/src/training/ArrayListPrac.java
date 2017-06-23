package training;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
//import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListPrac {

	
	public static void main(String[] args) {
		ArrayList <String> ArLst	= new ArrayList<String>(); 
   	 ArLst.add("Finally");
   	 ArLst.add("Able");
   	 ArLst.add("to");
   	 ArLst.add("do");
		ArrayListPrac alp = new ArrayListPrac();
		alp.aradd(ArLst);
		alp.Ite(ArLst);
		alp.SearchElements(ArLst, "ram");
		alp.ListIterator(ArLst);
		//alp.UpE();
		//alp.del();

	}
    void aradd(ArrayList<String> ar)//using for each
    {
    	//ArrayList<String> ar = new ArrayList<String>();
    	ar.add("sham");
    	ar.add("ram");
    	ar.add("drink pepsi");
    	ar.add(2, "new insertion");
    	System.out.println(ar);// to print in array form
    	
    	for(String i : ar)
    	{
    		int a= ar.indexOf(i);
    		System.out.println("index is "+ a+ ":" +i);
    	}
    }
    void Ite(ArrayList<String> ar)// using iterator
    {
    	ar.add("max");
    	ar.add("monty");
    	ar.add("drink pepsi");
    	ar.add(2, "play");	
    	
    Iterator<String> i = ar.iterator();
    while (i.hasNext())
    {
    	 String s = (String)i.next();
    	 System.out.println(s);
     }	
    }
     void SearchElements(ArrayList<String> ar, String s)// To search specific element in list
     {
    	 
    	 if (ar.contains(s))
    	 {
    		 System.out.print("it contains " +s+ " at index of " + ar.indexOf(s));
    	 }
    	 else {System.out.println("it does not contain" +s);}
     }
     
     void ListIterator(ArrayList<String> ar)// program to print reverse list using list iterator
     {
    	 ListIterator<String> Li = ar.listIterator();
    	 while (Li.hasNext())
    	 {Li.next();
    	 }
    	 while (Li.hasPrevious())
    	 {
    		String s = Li.previous();
    		System.out.println(s);
      	 }
    	 
   		
		}
    	     
    /* void UpE()// updating elements in array
    {
    	ArrayList<String> ar = new ArrayList<String>();
    	ar.add("max");
    	ar.add("monty");
    	ar.add("drink pepsi");
    	ar.add(2, "play");	
    	System.out.println(ar);
    	ar.set(0, "Ram");
    	ar.set(1, "sham");
    	System.out.println(ar);
    }
    void del()// remove elemnets in array
    {
    	ArrayList<String> ar = new ArrayList<String>();
    	ar.add("max");
    	ar.add("monty");
    	ar.add("drink pepsi");
    	ar.add(2, "play");
    	ar.remove("max");
    	System.out.println(ar);
    }*/
}
