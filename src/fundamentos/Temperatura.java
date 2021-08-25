package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// farenheit to celcius (70 °F − 32) × 5/9 = 21,111 °C
		double farenheit = 70;
		/*
		 * para criar uma variável constante utilizamos a palavra reservada 'final'
		 */
		final int ajuste = 32;
		final double fator = 5 / 9.0;
		double celcius = (farenheit - ajuste) * fator;

		System.out.println("A temperatura farenheit: " + farenheit + "°F é igual a " + celcius + "°C");
	}
}
