package VetorMatriz;

import java.util.Scanner;
/*Exerc�cio 1 - Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. 
O programa deve executar os seguintes passos: */

public class ExercicioVetor1 {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			double[] vetorA = new  double[6];
			double soma;
			
			vetorA[0] = 1.0;
			vetorA[1] = 0.0;
			vetorA[2] = 5.0;
			vetorA[3] = -2.0;
			vetorA[4] = -5.0;
			vetorA[5] = 7.0;
			
			soma=0;
			
			soma = vetorA[0] + vetorA[1]+ vetorA[5];
			
			vetorA[4] = 100; //mudan�a de valor
			
			for(int i=0; i<vetorA.length; i++) {
				System.out.println(vetorA[i]);
			}
			
			System.out.println("\nA soma dos valores �: " + soma);
			
			entrada.close();
		}
}


