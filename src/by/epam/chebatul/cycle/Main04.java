package by.epam.chebatul.cycle;

/*
  ��������� ��������� ���������� ������������ ��������� ������ ������� �����.
 */

public class Main04 {

	public static void main(String[] args) {

		long result;
		int errorIndicate;

		result = 1;
		errorIndicate = 0;

		for (int i = 1; i <= 100; i++) {
			if (result < 0) {
				System.out.println("���, �� ����� " + (i - 1) + " ���������� ������� ������� �������� (������������)");
				errorIndicate += 1;
				break;
			} else {
				result = result * i * i;
			}
		}

		if (errorIndicate == 0) {
			System.out.println("Result = " + result);
		}

	}

}
