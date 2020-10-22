package by.epam.chebatul.linear;

/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 ((sin x + cos y) / (cos x + sin y)) * tg xy
 */

public class Main03 {

	public static void main(String[] args) {

		double x;
		double y;
		double z;

		x = 4.5;
		y = 3;

		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);

		System.out.println("Result = " + z);

	}

}
