package curso_udemy;

import java.util.Scanner;

public class ExercicioEstruturaCondicional01 {

	public static void main(String[] args) {

		/*
		 * Exercício 01
		 * 
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 * 
		 * Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um Número:");
		int n1 = scan.nextInt();

		if (n1 > 0) {
			System.out.println("Este número é possitivo!");
		} else if (n1 == 0) {
			System.out.println("Este número é neutro");
		} else {
			System.out.println("Este número é negativo");
		}

		scan.close();

	}

}
