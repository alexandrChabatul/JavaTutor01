package by.epam.chebatul.linear;

/*
 Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc
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

		System.out.println(hh + " ч  " + mm + " мин  " + ss + " сек.");

	}

}
