package br.com.exer1;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Maya");
		c1.setCpf(123456);
		c1.setEndereço("Rua dos estados");
		c1.setFormaPagamento("Cartão");
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("CPF: " + c1.getCpf());
		System.out.println("Endereço: " + c1.getEndereço());
		System.out.println("Forma de pagamento: " + c1.getFormaPagamento());
		
	}

}
