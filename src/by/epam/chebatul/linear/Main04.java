package by.epam.chebatul.linear;

/*
  ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). �������� �������
������� � ����� ����� ����� � ������� ���������� �������� �����.
 */

public class Main04 {

	public static void main(String[] args) {

		double a = 624.853;

		double temp1;
		double temp2;
		double result;

		temp1 = (int) a / 1;
		temp2 = Math.ceil(a % 1 * 1000);
		result = temp2 + temp1 / 1000;

		System.out.println("Result = " + result);
	}

}
