package ProgramacaoSequencial;

import java.util.Scanner;

/*Exerc�cio 2 - Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
 expressa em anos, meses e dias.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idadeDias, idadeMeses, idadeAnos, bissexto, totalDias;
		
		System.out.println("Digite a quantidade de Dias: ");
		totalDias = ler.nextInt();
		
		idadeAnos = totalDias/365;
		
		bissexto = idadeAnos / 4;
		
		totalDias = totalDias%365 - bissexto;
		
		idadeMeses = totalDias/30;

		totalDias = totalDias%30;

		idadeDias = totalDias;
		
		System.out.println("A idade � : " + idadeAnos + " anos");
		System.out.println("\nA quantidade de meses � : " + idadeMeses + " meses");
		System.out.println("\nA quantidade de dias � : " + idadeDias + " dias");
	}

}
