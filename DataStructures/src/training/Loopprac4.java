package training;
public class Loopprac4 {

	public static void main(String[] args) {
		Loopprac4 L1 = new Loopprac4();
		/*
		 * L1.hi(15); L1.py(3); L1.pali(272); L1.pali(177); L1.arm(173);
		 * L1.arm(371);
		 */
		L1.fi(7);
	}

	// program for hi, hello and bye at 3, 5 , 3&5
	void hi(int i) {
		for (int a = 1; a <= i; a++) {
			if (a % 3 == 0 && a % 5 != 0) {
				System.out.print("hi" + " ");
			} else if (a % 5 == 0 && a % 3 != 0) {
				System.out.print("hello" + " ");
			} else if (a % 3 == 0 && a % 5 == 0) {
				System.out.println("bye" + " ");
			} else {
				System.out.print(a + " ");
			}
		}
	}

	// program for printing stars like * ** ***
	void py(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// program for palindrome
	void pali(int n) {
		int r, sum = 0, t;
		t = n;
		/* while (n > 0) */for (int i = 3; i > 0; i--) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		if (t == sum) {
			System.out.println("your number" + " " + t + "  is palindrome");
		} else {
			System.out.println(t + " its not plaindrome");
		}
	}

	// program for finding armstrong number
	void arm(int m) {
		int sum = 0, a, t;
		t = m;
		do {
			a = m % 10;
			sum = sum + (a * a * a);
			m = m / 10;
		} while (m > 0);
		if (t == sum) {
			System.out.println(t + " is a armstrong number");
		} else {
			System.out.println(t + " is not armstrong number");
		}

	}

	// program to find fibonacci series
	void fi(int n) {
		// int a=0,b=1,sum= 0;
		int c[] = new int[n];
		c[0] = 0;
		c[1] = 1;
		for (int i = 2; i < n; i++) {
			c[i] = c[i - 1] + c[i - 2];
			System.out.print(c[i]);
			/*
			 * System.out.print(sum + " "); sum = a+b ; a=b; b=sum;
			 */
		}
		
		System.out.println("\n");
		// for (int i = 0; i < n; i++)
		int i = 0;
		while (n > 0) {
			System.out.print(c[i]);
			i++;
			n--;
		}
	}
	

}
