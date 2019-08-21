package curso_udemy;

import java.util.Locale;

public class ExercicioFixacao_SaidaDeDados {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;

		
		System.out.println("Products:");
		System.out.printf("%s, which prise is $ %.2f%n%s, which price is $ %.2f%n%n",product1,price1,product2,price2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n",age,code,gender);
		System.out.printf("Measue with eight decimal places: %.6f%nRound (tree decimal places): %.3f%n",measure,measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal point: %.3f",measure);
	}

}
