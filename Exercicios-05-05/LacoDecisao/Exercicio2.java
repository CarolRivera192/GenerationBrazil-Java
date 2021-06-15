package LacoDecisao;

import java.util.Scanner;

//Exercício 2 - Faça um programa que entre com três números e coloque em ordem crescente.
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o primeiro número: ");
		a = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = ler.nextInt();
		
		if(a < b) {
			if(b < c) {
				System.out.println("\n" + a + "\n" + b + "\n" + c);
			}
			else if(a < c) {
				System.out.println("\n" + a + "\n" + c + "\n" + b);
			}
			else {
				System.out.println("\n" + c + "\n" + a + "\n" + b);
			}
		}
		else if(b < c) {
			if(a < c) {
				System.out.println("\n" + b + "\n" + a + "\n" + c);
			}
			else {
				System.out.println("\n" + c + "\n" + b + "\n" + a);
			}
		}
	}

}
