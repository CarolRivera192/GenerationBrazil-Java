package Polimorfismo;

public class Cachorro extends Animal implements Som{

	@Override
	public void emitiSom() {
		System.out.println("Au au au au...");
		
	}

	@Override
	public void correrOuSubir() {
		System.out.println("O Fred está correndo....");
		
	}
}
