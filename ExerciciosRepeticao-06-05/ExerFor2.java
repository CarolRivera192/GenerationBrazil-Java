package LacoRepeticao;

import java.util.Scanner;

//Exercício 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.
public class ExerFor2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i, contPar=0,contImpar=0;
		
		for (i=0; i<11; i++) {
			System.out.println("Digite um número: ");
	        i = entrada.nextInt();
	        
			if(i % 2 == 0) {
				contPar++;
	        }
	        else {
	        	contImpar++;
	        	
	        	entrada.close();
	        }
		}
		System.out.println("\nContém " + contPar + " números pares \n");
		System.out.println("Contém " + contImpar + " números ímpares \n");
		

	}

}
