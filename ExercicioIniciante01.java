package curso_udemy;

import java.util.Scanner;

public class ExercicioIniciante01 {

	public static void main(String[] args) {

		/*
		 * Exercício 01
		 * 
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos
		 * 
		 * Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
		 */

		Scanner scan = new Scanner(System.in);

		int n1, n2, soma;

		System.out.println("Digite o Primeiro número:");
		n1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		n2 = scan.nextInt();

		soma = n1 + n2;

		System.out.println("A Soma é = " + soma);

		scan.close();
	}

}
