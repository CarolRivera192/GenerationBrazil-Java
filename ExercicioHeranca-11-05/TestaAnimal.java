package br.com.exerheranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica pre= new Preguica();
		
		dog.setNome("Fred");
		dog.setIdade(8);
		dog.setSom("Auau");
		dog.setCorrer("Fred está correndo");
		
		horse.setNome("Pé de Pano");
		horse.setIdade(12);
		horse.setSom("hinn in in");
		horse.setCorrerCavalo("Pé de Pano está correndo rápido");
		
		pre.setNome("Bob");
		pre.setIdade(15);
		pre.setSom("Zzzzz");
		pre.setSubirArvores("Bob está subindo a árvore");
		
		System.out.println("=== Dados do Cachorro ===");
		System.out.println("Nome do Cachorro: " + dog.getNome());
		System.out.println("Idade do Cachorro: " + dog.getIdade()+ " anos");
		System.out.println("Som do Cachorro: " + dog.getSom());
		System.out.println("Ação do Cachorro: " + dog.getCorrer());
		
		
		System.out.println("\n=== Dados do Cavalo ===");
		System.out.println("Nome do Cavalo: " + horse.getNome());
		System.out.println("Idade do Cavalo: " + horse.getIdade() + " anos");
		System.out.println("Som do Cavalo: " + horse.getSom());
		System.out.println("Ação do Cavalo: " + horse.getCorrerCavalo());
		
		System.out.println("\n=== Dados da Preguiça ===");
		System.out.println("Nome da Preguiça: " + pre.getNome());
		System.out.println("Idade da Preguiça: " + pre.getIdade() + " anos");
		System.out.println("Som da Preguiça: " + pre.getSom());
		System.out.println("Ação da Preguiça: " + pre.getSubirArvores());

	}

}
