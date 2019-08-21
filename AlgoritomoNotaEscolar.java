package curso_udemy;

import java.util.Scanner;

public class AlgoritomoNotaEscolar {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in); //Scanner é usado para receber algum dado inputado, atribuindo o valor para a variavel.
		
		System.out.println("Digite a nota da Atividade 1:");
		double a1 = x.nextDouble();
		System.out.println("Digite a nota da Atividade 2:");
		double a2 = x.nextDouble();
		double media = a1 + a2;
		
		
		System.out.printf("Sua Média é " + media);
		
		x.close();
		

	}

}
