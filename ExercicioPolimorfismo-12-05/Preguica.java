package Polimorfismo;

public class Preguica extends Animal implements Som{

	@Override
	public void emitiSom() {
		System.out.println("Zzzzzzz");
		
	}

	@Override
	public void correrOuSubir() {
		System.out.println("O Bob está subindo a árvore....");
		
	}

}
