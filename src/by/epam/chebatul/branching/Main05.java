package by.epam.chebatul.branching;

import java.util.Scanner;

/*
  Вычислить значение функции:
   f(x) = {(x2 - 3x +9) if x <= 3 && (1 / (x3 + 6)) if x>3}
 */

public class Main05 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x;

		System.out.print("Введите Х >>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите Х >>");
		}
		x = sc.nextInt();

		double result;

		if (x <= 3) {
			result = x * x - 3 * x + 9;
			System.out.println("Result =  " + result);
		} else if (x > 3) {
			result = (double) 1 / (Math.pow(x, 3) + 6);
			System.out.println("Result =  " + result);
		}
		else {
			System.out.println("Это невероятно, но что-то пошло не так.");
		}

	}

}
