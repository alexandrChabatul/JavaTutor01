package by.epam.chebatul.branching;

/*
  ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� ��
�� �������������.
 */

public class Main01 {

	public static void main(String[] args) {

		int a;
		int b;

		a = 85;
		b = 5;

		if (a + b == 90 || a == 90 && a + b < 180 || b == 90 && a + b < 180) {
			System.out.println("����������� ���������� � �������� �������������.");
		} else if (a + b < 180) {
			System.out.println("����������� ����������, �� �� �������� �������������.");
		} else {
			System.out.println("����������� �� ����������.");
		}

	}

}
