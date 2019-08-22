package curso_udemy;

import java.util.Scanner;

public class ExercicioEstruturaCondicional02 {

	public static void main(String[] args) {

		/*
		 * Exercício 02
		 * 
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 * 
		 * Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = scan.nextInt();

		if (n % 2 == 0) {
			System.out.println("Este Número é Par");
		} else {
			System.out.println("Este Número é Impar");
		}
		scan.close();
	}
}