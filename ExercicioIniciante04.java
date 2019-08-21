package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIniciante04 {

	public static void main(String[] args) {

		/*
		 * Exercício 04
		 * 
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 * 
		 * Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int numero, horas;
		double valorHora, salario;

		numero = scan.nextInt();
		horas = scan.nextInt();
		valorHora = scan.nextDouble();

		salario = valorHora * horas;

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		scan.close();

	}

}
