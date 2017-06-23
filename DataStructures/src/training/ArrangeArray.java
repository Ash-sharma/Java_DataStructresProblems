package training;

public class ArrangeArray {


	public static void main(String[] args) {

		String ar1[]={"a1","a2","a3","a4","a5","b1","b2","b3","b4","b5"};
		ArrangeArray aa= new ArrangeArray();
		aa.Shuffhle(ar1);
	}
	void Shuffhle(String [] array)//print array like a1,b1,a2,b2,a3,b3
	{
		/*int i = 1;
		int j = (array.length / 2);
		while(j < (array.length - 1)){
			String temp = array[j];
			int k = j;
			while(k > i) {
				array[k] = array[k-1];
				k = k - 1;
			}
			array[i] = temp;
			i = i + 2;
			j = j + 1;
		}*/
		
		int i=1, n= array.length/2 ;
		for (int j= n; j<=array.length-1;j++)
		{
			String temp = array[j];
			for(int k =j; k>i; k--)
			{
				array[k]= array[k-1];
			}
			array [i]=temp;
			i= i+2;
		}
		for(int k =0; k<=array.length-1; k++)
		{System.out.print(array[k]+ " ");}

	}
}
