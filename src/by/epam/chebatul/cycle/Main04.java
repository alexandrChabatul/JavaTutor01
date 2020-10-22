package by.epam.chebatul.cycle;

/*
  Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Main04 {

	public static void main(String[] args) {

		long result;
		int errorIndicate;

		result = 1;
		errorIndicate = 0;

		for (int i = 1; i <= 100; i++) {
			if (result < 0) {
				System.out.println("Упс, на числе " + (i - 1) + " получилось слишком большое значение (переполнение)");
				errorIndicate += 1;
				break;
			} else {
				result = result * i * i;
			}
		}

		if (errorIndicate == 0) {
			System.out.println("Result = " + result);
		}

	}

}
