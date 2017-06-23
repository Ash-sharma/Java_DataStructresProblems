package training;

public class ArrayS {
	
	public static void main(String[] args) {
		int a[]={10,5,20,11,15,30,35};
		int b[]={1,2,3,6,5,4};
		ArrayS as = new ArrayS();
		as.Sort(a);
		as.sort2(b);
	}
	void Sort(int a[])// program to sort an array
	{ 
		 int temp1=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{temp1=a[j];
				a[j]=a[i];
				a[i]=temp1;
				//System.out.println(a[j]);
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	void sort2(int a[])// find two number sand swap them
	{   
		int t=0;
		for (int i = a.length-1; i>0;i--)
		{
			if (a[i]<a[i-1])
			{
				for(int j=0;j<=i; j++)
				{
					if (a[i]<a[j])
					{
						t = a[j];
						a[j]=a[i];
						a[i]= t;
					}
					System.out.print(a[j]);
				}
			}

		}

	}
}
