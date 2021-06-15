package LacoRepeticao;

import java.util.Scanner;

/*Exercício 6 - Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar 0.*/
public class ExerDoWhile2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma=0,cont=0;
		float media=0;
        
        do {
        	System.out.println("Digite um número: ");
            num = ler.nextInt();
        	
        	if(num % 3 == 0 && num!= 0) {//Múltiplos de 3
        		soma += num;
        		cont++;
        	}
        }
        while(num != 0);/*Enquanto num diferente de zero o código vai ser executado, ou seja, 
        quando a gente inserir o número zero , o programa vai ser encerrado */
       
        media = soma / cont;
        
        ler.close();
        System.out.println("\nA média é: " + media);
	}

}
