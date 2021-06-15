package br.com.exerheranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica pre= new Preguica();
		
		dog.setNome("Fred");
		dog.setIdade(8);
		dog.setSom("Auau");
		dog.setCorrer("Fred est� correndo");
		
		horse.setNome("P� de Pano");
		horse.setIdade(12);
		horse.setSom("hinn in in");
		horse.setCorrerCavalo("P� de Pano est� correndo r�pido");
		
		pre.setNome("Bob");
		pre.setIdade(15);
		pre.setSom("Zzzzz");
		pre.setSubirArvores("Bob est� subindo a �rvore");
		
		System.out.println("=== Dados do Cachorro ===");
		System.out.println("Nome do Cachorro: " + dog.getNome());
		System.out.println("Idade do Cachorro: " + dog.getIdade()+ " anos");
		System.out.println("Som do Cachorro: " + dog.getSom());
		System.out.println("A��o do Cachorro: " + dog.getCorrer());
		
		
		System.out.println("\n=== Dados do Cavalo ===");
		System.out.println("Nome do Cavalo: " + horse.getNome());
		System.out.println("Idade do Cavalo: " + horse.getIdade() + " anos");
		System.out.println("Som do Cavalo: " + horse.getSom());
		System.out.println("A��o do Cavalo: " + horse.getCorrerCavalo());
		
		System.out.println("\n=== Dados da Pregui�a ===");
		System.out.println("Nome da Pregui�a: " + pre.getNome());
		System.out.println("Idade da Pregui�a: " + pre.getIdade() + " anos");
		System.out.println("Som da Pregui�a: " + pre.getSom());
		System.out.println("A��o da Pregui�a: " + pre.getSubirArvores());

	}

}
