package by.epam.chebatul.cycle;

import java.util.Scanner;

/*
 Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */

public class Main01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int num;
		num = 0;

		// Input
		System.out.print("Введите целое положительное число:");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				if (num > 0) {
					break;
				} else {
					System.out.println("Ошибка.");
					System.out.print("Введите целое положительное число:");
				}
			} else {
				System.out.println("Ошибка.");
				System.out.print("Введите целое положительное число:");
				sc.next();
			}
		}

		long result;
		result = 0;

		for (int a = 0; a <= num; a++) {
			result = result + a;
		}

		System.out.println("Сумма чисел от 1 до " + num + " = " + result);

	}

}
