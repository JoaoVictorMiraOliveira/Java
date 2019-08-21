package curso_udemy;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String nome = scan.nextLine();
		System.out.println(nome);

		int idade = scan.nextInt();
		System.out.println(idade);
		
		
		scan.close();
		
	}

}
