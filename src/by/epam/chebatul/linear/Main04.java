package by.epam.chebatul.linear;

/*
  ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). ѕомен€ть местами
дробную и целую части числа и вывести полученное значение числа.
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
