package VetorMatriz;

//Exercício 2 - Faça um programa que receba 6 números inteiros e mostre: 

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        
        int num[] = new int[6];
        int i, soma = 0, cont = 0;
        
        for(i = 0 ; i < num.length ; i++) {//Leitura dos números
            System.out.println("Digite um número inteiro:");
            num[i] = leia.nextInt();
        }
        
        for(i = 0 ; i < num.length ; i++) {
            if(num[i] % 2 == 0) {//Verifica quem é par e soma eles
                System.out.print(num[i] + "\n");
                soma += num[i];
            }
        }
      
        System.out.println("\nA soma dos números pares digitados é igual a: " + soma);
        for(i = 0 ; i < num.length ; i++) {//Verifica quem é ímpar e coloca a quatidade deles
            if(num[i] % 2 != 0) {
                System.out.print(num[i] + "\n");
                cont ++;
            }
        }
        leia.close();
        
        System.out.println("\nA quantidade dos números ímpares digitados é: " + cont);
        
    }
}

