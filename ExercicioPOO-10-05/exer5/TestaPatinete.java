package br.com.exer5;

public class TestaPatinete {

	public static void main(String[] args) {
		
		Patinete pa = new Patinete();
		
		pa.setModelo("Skatenet");
		pa.setMarca("Scooter");
		pa.setNumeroRodas(3);
		pa.setValor(1000);
		
		System.out.println("Modelo: " + pa.getModelo());
		System.out.println("Marca: " + pa.getMarca());
		System.out.println("Número de rodas: " + pa.getNumeroRodas());
		System.out.println("Valor: " + pa.getValor());

	}

}
