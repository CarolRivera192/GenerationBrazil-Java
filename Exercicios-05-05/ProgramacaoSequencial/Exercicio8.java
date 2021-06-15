package ProgramacaoSequencial;

import java.util.Scanner;

/*Exercício 8 - O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */
public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float custocons, custofab, imposto, distribuidor;
		
		System.out.println("Digite o custo de fábrica de um carro novo: ");
		custofab = ler.nextFloat();
		
		imposto = (float) ((custofab*45.0)/100);
		distribuidor = (float) ((custofab*45.0) *28.0/100000);
		custocons = (distribuidor + imposto);
		
		System.out.println("O custo do consumidor de um carro novo é: " + custocons);


	}

}
