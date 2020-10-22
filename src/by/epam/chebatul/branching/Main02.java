package by.epam.chebatul.branching;

/*
 Найти max{min(a, b), min(c, d)}.
 */

public class Main02 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		a = 4;
		b = 6;
		c = 6;
		d = 4;

		int min1;
		int min2;
		int max;

		// min1
		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}

		// min2
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}

		// max
		if (min1 > min2) {
			max = min1;
		} else {
			max = min2;
		}

		System.out.println(max);

	}

}
