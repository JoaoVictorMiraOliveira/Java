package curso_udemy;

import java.util.Scanner;

public class ExercicioEstruturaCondicional03 {

	public static void main(String[] args) {

		/*
		 * Exercício 03
		 * 
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 * 
		 * Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int a = scan.nextInt();
		System.out.println("Digite o segundo número:");
		int b = scan.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}

		scan.close();
	}

}
