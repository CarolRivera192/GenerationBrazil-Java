package ProgramacaoSequencial;

import java.util.Scanner;

/*Exercício 7 - Um sistema de equações lineares do tipo:
 */
public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float a, b, c, d, j, f, g, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextFloat();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextFloat();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextFloat();
		
		System.out.println("Digite o valor de D: ");
		d = ler.nextFloat();
		
		System.out.println("Digite o valor de J: ");
		j = ler.nextFloat();
		
		System.out.println("Digite o valor de F: ");
		f = ler.nextFloat();
		
		System.out.println("Digite o valor de G: ");
		g = ler.nextFloat();
		
		x = ((c*j)-(b*f))/((a*j)-(b*d));
    	y = ((a*f)-(c*d))/((a*j)-(b*d));
    	
    	System.out.println("O valor de x é " + x + " e y é " + y);

	}

}
