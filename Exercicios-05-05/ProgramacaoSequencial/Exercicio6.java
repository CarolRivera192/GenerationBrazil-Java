package ProgramacaoSequencial;

import java.util.Scanner;
import  java.lang.Math;

/*Exercício 6 - Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula:
 */
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float x1, x2, y1, y2, d, r;
		
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextFloat();
		
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextFloat();
		
		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextFloat();
		
		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextFloat();
		
		d = (float) Math.pow((x2-x1),2 + Math.pow((y2-y1),2));
		r = (float) Math.sqrt(d);
		
		System.out.println("\nO valor da distância desses dois pontos é: " + r);

	}

}
