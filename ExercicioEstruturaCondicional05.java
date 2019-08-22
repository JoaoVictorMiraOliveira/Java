package curso_udemy;

import java.util.Scanner;

public class ExercicioEstruturaCondicional05 {

	public static void main(String[] args) {

		/*
		 * Exercício 05
		 * 
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 * Correção:
		 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Codigo:");
		int codigo = sc.nextInt();
		System.out.println("Digite a Quantidade:");
		int quantidade = sc.nextInt();

		double total;

		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else {
			total = quantidade * 1.5;
		}
		if (codigo > 4) {
			System.out.println("Erro de Codigo, verificar...");
		} else {
			System.out.printf("\nTotal: R$ %.2f%n\n", total);
			System.out.printf("Descrição do Pedido: \n %d (Unid.) do codigo %d",quantidade,codigo);

		}

		sc.close();

	}

}
