package ProgramacaoSequencial;

import java.util.Scanner;
import  java.lang.Math;

/*Exerc�cio 4 - Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:
 */
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float a, b, c, r, s, d;
		
		System.out.println("Digite um n�mero positivo A: ");
		a = ler.nextFloat();
		
		System.out.println("Digite um n�mero positivo B: ");
		b = ler.nextFloat();
		
		System.out.println("Digite um n�mero positivo C: ");
		c = ler.nextFloat();
		
		r = (float) Math.pow((a+b),2);
		s = (float) Math.pow((b+c),2);
		d = (r+s)/2;
		
		System.out.println("O valor de D �: " + d);

	}

}
