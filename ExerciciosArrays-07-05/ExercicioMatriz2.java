package VetorMatriz;

import java.util.Scanner;

//Exercício 4 - Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:

public class ExercicioMatriz2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matriz3 = new double[2][2];
		int constante;
		char opcao=0;
		
		System.out.println("Digite a matriz 1: ");
		
		for(int l=0; l<2; l++) {
			for(int  c=0; c<2; c++) {
				matriz1[l][c] = ler.nextDouble();
			}
		}
		System.out.println("Digite a matriz 2: ");
		
		for(int l=0; l<2; l++) {
			for(int  c=0; c<2; c++) {
				matriz2[l][c] = ler.nextDouble();
			}
		}
		while(opcao!='0'){ 

			System.out.println("\nDigite o que deseja fazer: ");
			System.out.println("[0] Sair do programa");
			System.out.println("[1] Somar as duas matrizes ");
			System.out.println("[2] Subtrair a primeira matriz da segunda");
			System.out.println("[3] Adicionar uma constante as duas matrizes");
			System.out.println("[4] Imprimir as matrizes");
			opcao = ler.next().charAt(0);
			
			switch(opcao) {
			case '0':
				System.out.println("=      FIM      =");

				break;
				
			case '1':
				System.out.println("Soma da matriz 1 e 2: ");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						matriz3[l][c] = (matriz1[l][c] + matriz2[l][c]);
						System.out.print(matriz3[l][c] + " | ");
					}
					System.out.println();
				}
				break;
				
			case '2':
				System.out.println("Subtração da matriz 1 e 2:");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						matriz3[l][c] = (matriz1[l][c] - matriz2[l][c]);
						System.out.print(matriz3[l][c] + " | ");
					}
					System.out.println();
				}
				break;
				
			case '3': 
				System.out.println("Digite a constante: ");
				constante = ler.nextInt();
				
				System.out.println("Soma da constante e matriz 1: ");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						matriz1[l][c] = (matriz1[l][c] + constante);
						System.out.print(matriz1[l][c] + " | ");
					}
					System.out.println();
				}
				System.out.println("Soma da constante e matriz 2: ");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						matriz2[l][c] = (matriz2[l][c] + constante);
						System.out.print(matriz2[l][c] + " | ");
					}
					System.out.println();
				}
				break;
				
			case '4': 
				System.out.println("Matriz 1: ");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						System.out.print(matriz1[l][c] + " | ");
					}
					System.out.println();
				}
				System.out.println("Matriz 2: ");
				for(int l=0; l<2; l++) {
					for(int  c=0; c<2; c++) {
						System.out.print(matriz2[l][c] + " | ");
					}
					System.out.println();
				}
				break;
			}
		}
		ler.close();
	}
}


	
