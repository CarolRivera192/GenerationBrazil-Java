package br.com.exer2;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		
		a1.setModelo("Boeing 777");
		a1.setMarca("Emirates");
		a1.setCompanhia("Emirates");
		a1.setNumPassageiros(400);
		
		System.out.println("Modelo: " + a1.getModelo());
		System.out.println("Marca: " + a1.getMarca());
		System.out.println("Companhia: " + a1.getCompanhia());
		System.out.println("Número de passageiros: " + a1.getNumPassageiros());

	}

}
