package by.epam.chebatul.cycle;

import java.util.Scanner;

/*
  ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����.
m � n �������� � ����������.

 */

public class Main07 {

	public static void main(String[] args) {

		int n;
		int m;

		do {
			n = enterFromConsole("������� ������ ����� ��������� >> ");
			m = enterFromConsole("������� ������� ����� ��������� >> ");
		} while (n > m);

		int temp;
		int absI;
		int indicate;
		indicate = 0;

		for (int i = n; i <= m; i++) {

			absI = Math.abs(i);

			if (absI == 1 || absI == 0) {
				System.out.print(i + " - ");
			} else {
				temp = absI - 1;
				System.out.print(i + " - ");

				while (temp != 1) {
					if (absI % temp == 0) {
						System.out.print(temp + "; ");
						indicate += 1;
					}
					temp -= 1;
				}

			}
			if (indicate == 0) {
				System.out.println("��� ��������� ����� ������ �����.");
			} else {
				System.out.println();
			}
			indicate = 0;

		}

	}

	public static int enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		num = sc.nextInt();
		return num;

	}
}
