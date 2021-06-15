package Polimorfismo;

public class ImprimiAnimal {

	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica pre= new Preguica();
		
		dog.setNome("Fred");
		dog.setIdade(8);
		
		horse.setNome("Pé de Pano");
		horse.setIdade(12);
		
		pre.setNome("Bob");
		pre.setIdade(15);
		
		System.out.println("=== Dados do Cachorro ===");
		System.out.println("Nome do Cachorro: " + dog.getNome());
		System.out.println("Idade do Cachorro: " + dog.getIdade()+ " anos");
		t.emitirSomAnimal(new Cachorro());
		t.correrOuSubirAnimal(new Cachorro());
		
		
		System.out.println("\n=== Dados do Cavalo ===");
		System.out.println("Nome do Cavalo: " + horse.getNome());
		System.out.println("Idade do Cavalo: " + horse.getIdade() + " anos");
		t.emitirSomAnimal(new Cavalo());
		t.correrOuSubirAnimal(new Cavalo());
		
		System.out.println("\n=== Dados da Preguiça ===");
		System.out.println("Nome da Preguiça: " + pre.getNome());
		System.out.println("Idade da Preguiça: " + pre.getIdade() + " anos");
		t.emitirSomAnimal(new Preguica());
		t.correrOuSubirAnimal(new Preguica());

	}

}
