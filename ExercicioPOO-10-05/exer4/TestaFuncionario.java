package br.com.exer4;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Matthew");
		f1.setCargo("Estagi�rio");
		f1.setSetor("TI");
		f1.setIdade(20);
		f1.setSalario(1500);
		
		System.out.println("Nome do funcion�rio: " + f1.getNome());
		System.out.println("Cargo do funcion�rio: " + f1.getCargo());
		System.out.println("Setor do funcion�rio: " + f1.getSetor());
		System.out.println("Idade do funcion�rio: " + f1.getIdade());
		System.out.println("Sal�rio do funcion�rio: R$" + f1.getSalario());

	}

}
