package LacoRepeticao;

import java.util.Scanner;

/*Exercício 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */
public class ExerWhile1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, idadeMaior=0, idadeMenor=0;
		
		System.out.println("Digite uma idade: ");
        idade = ler.nextInt();
        
        while(idade <= 99) {
        	if(idade < 21) {
        		idadeMenor++;
        	}
        	System.out.println("Digite uma idade: ");
            idade = ler.nextInt();
        	if(idade > 50) {
        		idadeMaior++;
        	}
        }
        ler.close();
        System.out.println("\nTotal de pessoas com menos de 21 anos:  " + idadeMenor);
        System.out.println("\nTotal de pessoas com mais de 50 anos:  " + idadeMaior);

	}

}
