package training;

import java.util.HashSet;


public class SetQ {

		public static void main(String[] args) {
			
			String ar[] ={"Mike","John","Mike","John","Doe"};
			HashSet<String> Set = new HashSet<String>();
			/*Set.add("Mike");
			Set.add("John");
			Set.add("Mike");
			Set.add("John");
			Set.add("Doe");*/
			SetQ sq= new SetQ();
			sq.FindDuplicates(Set, ar);
			}
		void FindDuplicates(HashSet<String> s, String [] a)// to find duplicate in set form array
		{
			for(String i: a)
			{ if (!s.add(i)){
				System.out.println(i);}
			}
		}
		
		
}
