package by.epam.chebatul.linear;

/*
 ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. �������
������ �������� ������������ � �����, ������� � �������� � ��������� �����:
��� ����� SSc
 */

public class Main05 {

	public static void main(String[] args) {

		int t;

		t = 50046;

		int hh;
		int mm;
		int ss;

		hh = t / 3600;
		mm = (t % 3600) / 60;
		ss = (t % 3600) % 60;

		System.out.println(hh + " �  " + mm + " ���  " + ss + " ���.");

	}

}
