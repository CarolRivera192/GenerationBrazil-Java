package LacoDecisao;
/*Exerc�cio 4 -	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba 
 * se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float num = 0;
        
        System.out.println("Digite um n�mero: ");
        num = ler.nextFloat();
        
        if(num % 2 == 0) {
            System.out.println("\nO N�mero � Par");
            System.out.println("\nA raiz quadrada do n�mero �: " + Math.sqrt(num));
        }
        else {
            System.out.println("\nO N�mero � Impar");
            System.out.println("\nO numero elevado ao quadrado �: " + Math.pow(num,2));
        }
	}
}
	
	