package by.epam.chebatul.branching;

/*
  ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.
 */

public class Main03 {
	public static void main(String[] args) {

		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		x1 = 2;
		x2 = 3;
		x3 = 3;
		y1 = 4;
		y2 = 1;
		y3 = 10;

		if (x1 == x2 && x1 == x3 || y1 == y2 && y1 == y3) {
			System.out.println("����� �� ����� ������.");
		} else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("����� �� ����� ������.");
		} else {
			System.out.println("����� �� �� ����� ������.");
		}

	}

}
