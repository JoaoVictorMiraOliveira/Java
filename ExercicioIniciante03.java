package curso_udemy;

import java.util.Scanner;

public class ExercicioIniciante03 {

	public static void main(String[] args) {

		/*
		 * Exercício 03 
		 * 
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 * 
		 * Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
		 */

		Scanner scan = new Scanner(System.in);
		
		int A, B, C, D, p1, p2, diferenca;
		
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();		
		
		p1 = A * B; //Produto de A e B
		p2 = C * D; //Produto de C e D
		
		diferenca = p1-p2; //Resultado final
		
		System.out.println("Diferença = " + diferenca);
		
		scan.close();
		
	}

}
