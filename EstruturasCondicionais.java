package curso_udemy;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scan.nextInt();

		//SE
		if (n % 2 == 0) {
			System.out.println("Este Número é Par");
		} 
		//SENÃO
		else {
			System.out.println("Este Número é Impar");
		}
		scan.close();
	}
}