package curso_udemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIniciante02 {

	public static void main(String[] args) {

		/*
		 * Exercício 02 
		 *  
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area =  . raio2 Considere o valor de π = 3.14159
		 * 
		 * Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		Locale.setDefault(Locale.US); //Convertendo para outra linguagem numerica 
		
		double area,raio,PI=3.14159; //Atribuição as variaveis double e do valor de PI (π);
		
	
		System.out.println("Digite o valor do Raio:");
		raio = scan.nextDouble(); //Leitura do valor do Raio Informado
	
		area = PI * raio*raio; //Formula da Area do  Circulo
		
		System.out.printf("Area do circulo = %.4f " ,area); //Resultado final
		
		scan.close();

	}

}
