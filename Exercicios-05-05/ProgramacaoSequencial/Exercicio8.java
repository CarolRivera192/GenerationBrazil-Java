package ProgramacaoSequencial;

import java.util.Scanner;

/*Exerc�cio 8 - O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */
public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float custocons, custofab, imposto, distribuidor;
		
		System.out.println("Digite o custo de f�brica de um carro novo: ");
		custofab = ler.nextFloat();
		
		imposto = (float) ((custofab*45.0)/100);
		distribuidor = (float) ((custofab*45.0) *28.0/100000);
		custocons = (distribuidor + imposto);
		
		System.out.println("O custo do consumidor de um carro novo �: " + custocons);


	}

}
