package LacoRepeticao;

import java.util.Scanner;

//Exerc�cio 2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
public class ExerFor2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i, contPar=0,contImpar=0;
		
		for (i=0; i<11; i++) {
			System.out.println("Digite um n�mero: ");
	        i = entrada.nextInt();
	        
			if(i % 2 == 0) {
				contPar++;
	        }
	        else {
	        	contImpar++;
	        	
	        	entrada.close();
	        }
		}
		System.out.println("\nCont�m " + contPar + " n�meros pares \n");
		System.out.println("Cont�m " + contImpar + " n�meros �mpares \n");
		

	}

}
