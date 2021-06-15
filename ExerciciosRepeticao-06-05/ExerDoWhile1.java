package LacoRepeticao;

import java.util.Scanner;

/*Exercício 5 - Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.
 */
public class ExerDoWhile1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma=0;
        
        do {
        	System.out.println("Digite um número: ");
            num = ler.nextInt();
        	soma = soma + num;
        }
        while(num != 0);/*Enquanto num diferente de zero o código vai ser executado, ou seja, 
        quando a gente inserir o número zero , o programa vai ser encerrado */
        
        ler.close();
        System.out.println("\nA soma é: " + soma);
	}

}
