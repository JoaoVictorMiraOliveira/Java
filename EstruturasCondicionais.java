package curso_udemy;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n = scan.nextInt();

		//SE
		if (n % 2 == 0) {
			System.out.println("Este N�mero � Par");
		} 
		//SEN�O
		else {
			System.out.println("Este N�mero � Impar");
		}
		scan.close();
	}
}