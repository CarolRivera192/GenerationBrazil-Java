package ProgramacaoSequencial;

import java.util.Scanner;

/*Exercício 5 - Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
 */
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, p1=2, p2=3, p3=5, media;
		
		System.out.println("Insira o valor da primeira nota: ");
		n1 = ler.nextFloat();
		
		System.out.println("Insira o valor da terceira nota: ");
		n2 = ler.nextFloat();
		
		System.out.println("Insira o valor da terceira nota: ");
		n3 = ler.nextFloat();
		
		media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
		
		System.out.println("O valor da média é: " + media);

	}

}
