package Polimorfismo;

public class Cavalo extends Animal implements Som{

	@Override
	public void emitiSom() {
		System.out.println("Hin hin hin...");
		
	}

	@Override
	public void correrOuSubir() {
		System.out.println("O Pé de Pano está correndo....");
		
	}

}
