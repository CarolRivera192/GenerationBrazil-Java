package ProgramacaoSequencial;

import java.util.Scanner;
import  java.lang.Math;

/*Exercício 4 - Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:
 */
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float a, b, c, r, s, d;
		
		System.out.println("Digite um número positivo A: ");
		a = ler.nextFloat();
		
		System.out.println("Digite um número positivo B: ");
		b = ler.nextFloat();
		
		System.out.println("Digite um número positivo C: ");
		c = ler.nextFloat();
		
		r = (float) Math.pow((a+b),2);
		s = (float) Math.pow((b+c),2);
		d = (r+s)/2;
		
		System.out.println("O valor de D é: " + d);

	}

}
