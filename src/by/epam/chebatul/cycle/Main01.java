package by.epam.chebatul.cycle;

import java.util.Scanner;

/*
 �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ��������� ���������
��� ����� �� 1 �� ���������� ������������� �����.
 */

public class Main01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int num;
		num = 0;

		// Input
		System.out.print("������� ����� ������������� �����:");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				if (num > 0) {
					break;
				} else {
					System.out.println("������.");
					System.out.print("������� ����� ������������� �����:");
				}
			} else {
				System.out.println("������.");
				System.out.print("������� ����� ������������� �����:");
				sc.next();
			}
		}

		long result;
		result = 0;

		for (int a = 0; a <= num; a++) {
			result = result + a;
		}

		System.out.println("����� ����� �� 1 �� " + num + " = " + result);

	}

}
