package by.epam.chebatul.branching;

/*
  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
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
			System.out.println("Точки на одной прямой.");
		} else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Точки на одной прямой.");
		} else {
			System.out.println("Точки не на одной прямой.");
		}

	}

}
