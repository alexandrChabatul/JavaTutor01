package by.epam.chebatul.cycle;

/*
  Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Main08 {

	public static void main(String[] args) {

		int a;
		int b;

		a = 123;
		b = 2536;

		int tempA;
		int tempB;
		int numA;
		int numB;

		tempA = a;
		tempB = b;

		while (tempA != 0) {
			numA = tempA % 10;

			do {
				numB = tempB % 10;

				if (numA == numB) {
					System.out.print(numA + ", ");
				}
				tempB /= 10;

			} while (tempB != 0);
			
			tempA /= 10;
			tempB = b;
		}

	}

}
