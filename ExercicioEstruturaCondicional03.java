package curso_udemy;

import java.util.Scanner;

public class ExercicioEstruturaCondicional03 {

	public static void main(String[] args) {

		/*
		 * Exerc�cio 03
		 * 
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
		 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 * 
		 * Corre��o:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero:");
		int a = scan.nextInt();
		System.out.println("Digite o segundo n�mero:");
		int b = scan.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o multiplos");
		} else {
			System.out.println("N�o s�o multiplos");
		}

		scan.close();
	}

}
