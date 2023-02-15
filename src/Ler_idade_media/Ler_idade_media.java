package Ler_idade_media;

import java.util.Locale;
import java.util.Scanner;

public class Ler_idade_media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int cont = 0;
		double soma = 0;
		
		while (idade >= 0) {
			soma += idade;
			cont += 1;
			idade = sc.nextInt();
		}
		if(cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("Impossivel calcular");
		}
			
		sc.close();

	}

}
