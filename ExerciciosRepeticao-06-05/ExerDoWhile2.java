package LacoRepeticao;

import java.util.Scanner;

/*Exerc�cio 6 - Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0.*/
public class ExerDoWhile2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma=0,cont=0;
		float media=0;
        
        do {
        	System.out.println("Digite um n�mero: ");
            num = ler.nextInt();
        	
        	if(num % 3 == 0 && num!= 0) {//M�ltiplos de 3
        		soma += num;
        		cont++;
        	}
        }
        while(num != 0);/*Enquanto num diferente de zero o c�digo vai ser executado, ou seja, 
        quando a gente inserir o n�mero zero , o programa vai ser encerrado */
       
        media = soma / cont;
        
        ler.close();
        System.out.println("\nA m�dia �: " + media);
	}

}
