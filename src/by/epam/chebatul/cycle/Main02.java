package by.epam.chebatul.cycle;

/*
  Вычислить значения функции на отрезке [а,b] c шагом h:
  y = {x if x> 2 && = -x if x<=2
 */

public class Main02 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;

		a = -20;
		b = 10;
		h = 3;

		for (int i  = a; i <= b; i = i + h) {
			if (i > 2) {
				System.out.println("При х = "+ i + " значение функции = " + i);
			} else {
				System.out.println("При х = "+ i + " значение функции = " + (-i));
			}
		}

	}

}
