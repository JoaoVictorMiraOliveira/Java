package curso_udemy;

import java.util.Scanner;

public class ExercicioEstruturaCondicional02 {

	public static void main(String[] args) {

		/*
		 * Exerc�cio 02
		 * 
		 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou
		 * �mpar.
		 * 
		 * Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int n = scan.nextInt();

		if (n % 2 == 0) {
			System.out.println("Este N�mero � Par");
		} else {
			System.out.println("Este N�mero � Impar");
		}
		scan.close();
	}
}