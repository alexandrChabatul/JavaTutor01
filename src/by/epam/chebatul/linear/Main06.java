package by.epam.chebatul.linear;

/*
  ��� ������ ������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (�, �)
����������� ����������� �������, � false � � ��������� ������: 
 */

public class Main06 {

	public static void main(String[] args) {
		
		int x;
		int y;

		x = 3;
		y = -2;

		if (((Math.abs(x) <= 2 && y <= 4 && y >= 0) || (Math.abs(x) <= 4 && y <= 0 && y >= -3))) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
