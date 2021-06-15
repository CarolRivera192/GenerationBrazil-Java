package br.com.exer4;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Matthew");
		f1.setCargo("Estagiário");
		f1.setSetor("TI");
		f1.setIdade(20);
		f1.setSalario(1500);
		
		System.out.println("Nome do funcionário: " + f1.getNome());
		System.out.println("Cargo do funcionário: " + f1.getCargo());
		System.out.println("Setor do funcionário: " + f1.getSetor());
		System.out.println("Idade do funcionário: " + f1.getIdade());
		System.out.println("Salário do funcionário: R$" + f1.getSalario());

	}

}
