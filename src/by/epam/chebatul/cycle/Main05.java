package by.epam.chebatul.cycle;

/*
 ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� �����
��������� �. ����� ���� ���� ����� ���:
 an = 1 / 2^n + 1 / 3^n
 */

public class Main05 {

	public static void main(String[] args) {

		double e;
		int n; // ����� ������ ����.

		e = 0.15;
		n = 100;

		double result;
		double a;

		result = 0;

		for (double i = 1; i <= n; i++) {

			a = 1 / Math.pow(2, (i)) + 1 / Math.pow(3, (i));

			if (Math.abs(a) >= e) {
				result += a;
			}
		}

		System.out.println("Result = " + result);

	}

}
