package br.com.exer3;

public class TestaProduto {

	public static void main(String[] args) {
		
		Produto pd = new Produto();
		
		pd.setCodigo("dgtsxx0");
		pd.setModelo("Equipamento Eletr�nico");
		pd.setDescricao("Notebook");
		pd.setValor(2500);
		pd.descontoDinheiro(250);
		
		System.out.println("C�digo do produto: " + pd.getCodigo());
		System.out.println("Modelo do produto: " + pd.getModelo());
		System.out.println("Descri��o do produto: " + pd.getDescricao());
		System.out.println("Valor do produto: R$" + pd.getValor());
		System.out.println("Valor do produto com desconto: R$" + pd.getDescontoDinheiro());
		

	}

}
