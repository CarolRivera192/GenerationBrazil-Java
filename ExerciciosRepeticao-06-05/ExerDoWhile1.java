package LacoRepeticao;

import java.util.Scanner;

/*Exerc�cio 5 - Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.
 */
public class ExerDoWhile1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma=0;
        
        do {
        	System.out.println("Digite um n�mero: ");
            num = ler.nextInt();
        	soma = soma + num;
        }
        while(num != 0);/*Enquanto num diferente de zero o c�digo vai ser executado, ou seja, 
        quando a gente inserir o n�mero zero , o programa vai ser encerrado */
        
        ler.close();
        System.out.println("\nA soma �: " + soma);
	}

}
