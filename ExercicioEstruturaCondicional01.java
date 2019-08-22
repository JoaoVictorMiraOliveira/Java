package curso_udemy;

import java.util.Scanner;

public class ExercicioEstruturaCondicional01 {

	public static void main(String[] args) {

		/*
		 * Exerc�cio 01
		 * 
		 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero �
		 * negativo ou n�o.
		 * 
		 * Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um N�mero:");
		int n1 = scan.nextInt();

		if (n1 > 0) {
			System.out.println("Este n�mero � possitivo!");
		} else if (n1 == 0) {
			System.out.println("Este n�mero � neutro");
		} else {
			System.out.println("Este n�mero � negativo");
		}

		scan.close();

	}

}
