package training;
enum months{
	January, Feburary, March, April,May, June, July, Augus, September, October, Noveember, December
}
public class Exenum {

	public static void main(String[] args) {
		for (months m:months.values())
		{
			System.out.printf("%s ", m);
		}		

	}

}
