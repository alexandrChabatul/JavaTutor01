package by.epam.chebatul.branching;

/*
 ������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ �����
���������.

 */

public class Main04 {

	public static void main(String[] args) {

		int a;
		int b;
		int x;
		int y;
		int z;

		a = 4;
		b = 6;
		x = 1;
		y = 4;
		z = 7;

		if ((x <= a && (y <= b || z <= b)) || (y <= a && (x <= b || z <= b)) || (z <= a && (x <= b && y <= b))) {
			System.out.println("������ �������� � ���������.");
		} else {
			System.out.println("������ �� �������� � ���������.");
		}

	}

}
