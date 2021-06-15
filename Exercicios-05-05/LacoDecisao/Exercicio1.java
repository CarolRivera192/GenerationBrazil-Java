package LacoDecisao;

import java.util.Scanner;

//Exercício 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3, maior=0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		}
		else if(n2 > n1 && n2 > n3) {
			maior = n2;
		}
		else if(n3 > n1 && n3 > n2) {
			maior = n3;
		}
		System.out.println("\nO número maior é: " + maior);

	}

}
