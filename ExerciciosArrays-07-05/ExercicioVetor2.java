package VetorMatriz;

//Exerc�cio 2 - Fa�a um programa que receba 6 n�meros inteiros e mostre: 

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        
        int num[] = new int[6];
        int i, soma = 0, cont = 0;
        
        for(i = 0 ; i < num.length ; i++) {//Leitura dos n�meros
            System.out.println("Digite um n�mero inteiro:");
            num[i] = leia.nextInt();
        }
        
        for(i = 0 ; i < num.length ; i++) {
            if(num[i] % 2 == 0) {//Verifica quem � par e soma eles
                System.out.print(num[i] + "\n");
                soma += num[i];
            }
        }
      
        System.out.println("\nA soma dos n�meros pares digitados � igual a: " + soma);
        for(i = 0 ; i < num.length ; i++) {//Verifica quem � �mpar e coloca a quatidade deles
            if(num[i] % 2 != 0) {
                System.out.print(num[i] + "\n");
                cont ++;
            }
        }
        leia.close();
        
        System.out.println("\nA quantidade dos n�meros �mpares digitados �: " + cont);
        
    }
}

