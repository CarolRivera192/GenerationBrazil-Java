package VetorMatriz;

import java.util.Scanner;

//Exerc�cio 3 - Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		int cont=0;
		
		for(int l=0; l<=2; l++) {
			for(int c=0; c<=2; c++) {
					System.out.printf("Digite os n�meros %d %d: ", l, c);
					matriz[l][c] = entrada.nextDouble();
					
					if(matriz[l][c] < 10) {
						cont++;
					}
				}
			System.out.println();
			}
			System.out.println("Cont�m 1" + cont + " n�meros maiores que 10");
		
		entrada.close();
	}
}

	