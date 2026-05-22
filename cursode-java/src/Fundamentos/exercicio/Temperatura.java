package Fundamentos;

public class Temperatura {

	public static void main(String[] args) {

		// (F - 32) * 5/9 = C

		final double Fahrenheit = 86;
		final double Celsius = Fahrenheit - 32 * 5 / 9;

		System.out.println(Celsius);

	}
}