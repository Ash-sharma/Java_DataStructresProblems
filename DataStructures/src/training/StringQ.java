package training;

public class StringQ {

	public static void main(String[] args) {
		String s= "Donut";
		String t= "This is nice.";
		String u = "This is Java";
		String w = "abb";
		StringQ st = new StringQ();
		st.rev(s);
		st.subs(s);
		st.insert(t);
		st.revInd(u);
		st.palString(w);
	}
	void  rev(String s)// reverse string
	{
	 String a="";
	 for (int i=s.length()-1; i>=0; i--)
	 {
		 a=a+ s.charAt(i);
			 }
	 System.out.println(a);
	}
	
	void subs(String s)// extract substring and replace it
	{
		String c=s.substring(2,5);
		String a=s.replace("nut", "NUT");
		System.out.println(a);
		System.out.println(c);
			}
	
	void insert(String s)// insert nymber in plcae of space
	{
		int j =1;
		for (int i =0; i<=s.length()-1; i++)
		{
			if (s.charAt(i)==' ' || s.charAt(i)=='.')
			{
				/*s= s+j;*/
				System.out.print(j+ " ");
				j++;
			}
			else
			{System.out.print(s.charAt(i));}
					}	
	}
	
    void revInd(String s)// reversing each word in string
    {
       	String t="", u=" ";
    	for (int i=0; i<=s.length()-1; i++)
    	{
    		t= t+s.charAt(i);
    		//System.out.print(t);
    		if(s.charAt(i)==' '||i==s.length()-1)
    		{
    		for (int j=t.length()-1; j>=0 ;j--)
    		{
    			u=u+t.charAt(j);
    			
    			//System.out.print(u);
    		}
    		t="";
    		}
    	}
    	System.out.println(u);
    }
    
    void palString(String s)// program to check if a string is pallindrome or not
    {
    	String t="";
    	for (int i =s.length()-1; i>=0;i-- )
    	{
    		t= t + s.charAt(i);
    	}
    	if (t.equalsIgnoreCase(s))
    	{System.out.println("string is pallidrome  "+s+ "    "+t);}
    	else
    	{System.out.println("not a pallindrome  "+s+"   "+t);}
    }
}
