package LacoDecisao;

import java.util.Scanner;

//Exerc�cio 1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3, maior=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
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
		System.out.println("\nO n�mero maior �: " + maior);

	}

}
