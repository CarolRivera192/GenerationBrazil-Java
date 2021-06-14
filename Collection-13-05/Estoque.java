package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	public static void main(String[] args) {
		
		ArrayList<String> estoque = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);

		
		System.out.println("Indique a opção desejada: ");
		System.out.println("[0] Sair do programa.");
		System.out.println("[1] Adicionar item no estoque.");
		System.out.println("[2] Remover item no estoque.");
		System.out.println("[3] Atualizar item no estoque.");
		System.out.println("[4] Mostrar estoque.");
		
		int option = ler.nextInt();
		String produtos = ler.nextLine();
		
		switch(option) {
		
			case 1: 
				System.out.println("Digite o produto: ");
				estoque.add(produtos);
				break;
			
			case 2: 
				System.out.println("Digite o item que deseja remover: ");
				estoque.remove(produtos);
				break;
			
			case 3:
				System.out.println("Indique número do item que deseja atualizar");
				int num = ler.nextInt();
				
				System.out.println("Digite o novo produto: ");
				estoque.set(num + 1, produtos);
				break;
				
			case 4: 
				for (int i = 0; i < estoque.size(); i++) {//For-each
					System.out.println("O estoque completo é: ");
					System.out.println(estoque.get(i));
				}
				break;
					
			default: 
				System.out.println("Saiu do sistema!");
			
		}
		ler.close();
	}
}
