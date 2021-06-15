package LacoRepeticao;

import java.util.Scanner;

/*Exercício 4 - Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:*/
public class ExerWhile2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0, idade,calma = 0, OutrosCalmo = 0, Calma18 = 0, MulheresNervosas = 0 
		,Nervosos40 = 0, HomensAgressivos = 0;
		char sexo, temperamento;
		
		while(i < 150) {
			System.out.println("Digite sua idade: ");
	        idade = entrada.nextInt();
	        
	        System.out.println("Sexo: 1-Feminino, 2-Masculino, 3-Outros");
	        System.out.println("Digite o número correspondente ao seu sexo: ");
	        sexo = entrada.next().charAt(0);
	        
	        System.out.println("Temperamento: 1-Pessoa calma, 2-Pessoa nervosa, 3-Pessoa agressiva");
	        System.out.println("Digite o seu temperamento: ");
	        temperamento = entrada.next().charAt(0);
	        
	        i++;
	        
	        if(temperamento == '1'){
				calma++;
				
					if(sexo == '3') {
						OutrosCalmo++;
					}
				
					if(idade < 18) {
						Calma18++;
					}
			} 
	        if(temperamento == '2') {
					if(sexo == '1') {
						MulheresNervosas++;
					}
					
					if(idade > 40) {
						Nervosos40++;
					}
			} 
	        if(sexo == '2' && temperamento == '3') {
				HomensAgressivos++;
			}
		}
		entrada.close();
		System.out.println("Numero de pessoas calmas: " + calma);
		System.out.println("Numero de mulheres nervosas: " + MulheresNervosas);
		System.out.println("Numero de homens agressivos: " + HomensAgressivos);
		System.out.println("Numero de outros calmo: "+ OutrosCalmo);
		System.out.println("Numero de pessoas nervosas com mais de 40 anos: " + Nervosos40);
		System.out.println("Numero de pessoas calmas com menos de 18 anos: " + Calma18);

	}
}
