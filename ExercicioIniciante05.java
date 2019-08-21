package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIniciante05 {

	public static void main(String[] args) {

		/*
		 * Exercício 05
		 * 
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 * 
		 * Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
		 */

		Scanner scan = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		//int cod1, cod2;
		int qnt1, qnt2;
		double preco1, preco2, total;
		
		//cod1 = scan.nextInt();
		qnt1 = scan.nextInt();
		preco1 = scan.nextDouble();
		
		//cod2 = scan.nextInt();
		qnt2 = scan.nextInt();
		preco2 = scan.nextDouble();
		
		total = preco1 * qnt1 + preco2 * qnt2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ",total);		
		
		scan.close();
		
	}

}
