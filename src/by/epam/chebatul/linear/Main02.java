package by.epam.chebatul.linear;

/*
  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
  (b + sqrt (b2 + 4ac)) / 2a - a3c + b-2
 */

public class Main02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double z;

		b = 16;
		a = 4.2;
		c = 6.1;

		z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a + Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("Result = " + z);

	}

}
