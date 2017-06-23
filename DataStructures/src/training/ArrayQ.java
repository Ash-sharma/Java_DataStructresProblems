package training;

public class ArrayQ {

		public static void main(String[] args) {
	      int a[]= {5,10,25,60,15};
	      int b[]= {1,2,60,3,5};
	      int c[]={1,2,3,4,6};
	      ArrayQ ar = new ArrayQ();
	      ar.LN(a);
	     ar.MS(c);
	      ar.ComNum(a, b);
	      	      	}
		
		void LN(int a[])// to find the largest number in array
		{  int temp= a[0];
			for (int i=0; i<a.length-1; i++)
					{if (temp<a[i+1])
						{temp=a[i+1];}
						}
			System.out.println("largest number is " + temp);
		}
 
		void MS(int b[])// to find missing numbers in sorted array
		{
			int m=0, n= b.length+1;
			int sum = (n*(n+1))/2;
			for(int i=0;i<b.length;i++)
			{
				 m=m+b[i];
				//{System.out.println("missing number is "+ m);}
			}
			int miss=sum- m;
			System.out.println("missing number is" + miss);
		}
		void ComNum(int a[], int b[])// to find common number in any two arrays
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0; j<b.length;j++)
				{
					if (a[i]==b[j])
					{System.out.println("common number is "+ a[i]);}
				}
			}
		}
		
		
}
