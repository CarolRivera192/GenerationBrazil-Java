package LacoDecisao;
/*Exercício 4 -	Faça um programa em que permita a entrada de um número qualquer e exiba 
 * se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float num = 0;
        
        System.out.println("Digite um número: ");
        num = ler.nextFloat();
        
        if(num % 2 == 0) {
            System.out.println("\nO Número é Par");
            System.out.println("\nA raiz quadrada do número é: " + Math.sqrt(num));
        }
        else {
            System.out.println("\nO Número é Impar");
            System.out.println("\nO numero elevado ao quadrado é: " + Math.pow(num,2));
        }
	}
}
	
	