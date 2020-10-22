package by.epam.chebatul.linear;

/*
  Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: 
 */

public class Main06 {

	public static void main(String[] args) {
		
		int x;
		int y;

		x = 3;
		y = -2;

		if (((Math.abs(x) <= 2 && y <= 4 && y >= 0) || (Math.abs(x) <= 4 && y <= 0 && y >= -3))) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
