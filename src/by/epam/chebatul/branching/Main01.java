package by.epam.chebatul.branching;

/*
  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */

public class Main01 {

	public static void main(String[] args) {

		int a;
		int b;

		a = 85;
		b = 5;

		if (a + b == 90 || a == 90 && a + b < 180 || b == 90 && a + b < 180) {
			System.out.println("Треугольник существует и является прямоугольным.");
		} else if (a + b < 180) {
			System.out.println("Треугольник существует, но не является прямоугольным.");
		} else {
			System.out.println("Треугольник не существует.");
		}

	}

}
