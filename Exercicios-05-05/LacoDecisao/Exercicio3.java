package LacoDecisao;

import java.util.Scanner;

//Exercício 3 -	Faça um programa que receba a idade de uma pessoa e 
//mostre na saída em qual categoria ela se encontra:
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();
        
        if (idade >= 10 && idade <= 14) {
            System.out.println("\nInfantil");
        } 
        else if (idade >= 15 && idade <= 17) {
            System.out.println("\nJuvenil");
        } 
        else if (idade >= 18 && idade <= 25){
            System.out.println("\nAdulto");
        } 
    }
}

