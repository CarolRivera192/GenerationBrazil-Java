package ProgramacaoSequencial;

import java.util.Scanner;

/*Exerc�cio 3 - Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int horas, minutos, segundos, seg;
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		segundos = ler.nextInt();
		
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		seg = ((segundos % 3600) % 60);
		
		System.out.println("\nA dura��o do evento foi de "+ horas + " horas " + minutos +" minutos e " + seg + " segundos");
	}

}
