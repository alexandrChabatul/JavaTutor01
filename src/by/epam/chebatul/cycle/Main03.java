package by.epam.chebatul.cycle;

/*
  ����� ����� ��������� ������ ��� �����.
 */

public class Main03 {

	public static void main(String[] args) {

		int result;
		result = 0;

		for (int i = 1; i <= 100; i++) {
			result = result + i * i;
		}

		System.out.println("Result = " + result);

	}

}
