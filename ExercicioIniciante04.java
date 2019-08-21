package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIniciante04 {

	public static void main(String[] args) {

		/*
		 * Exerc�cio 04
		 * 
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
		 * casas decimais.
		 * 
		 * Corre��o: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
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
