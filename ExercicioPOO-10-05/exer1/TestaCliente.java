package br.com.exer1;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Maya");
		c1.setCpf(123456);
		c1.setEndere�o("Rua dos estados");
		c1.setFormaPagamento("Cart�o");
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("CPF: " + c1.getCpf());
		System.out.println("Endere�o: " + c1.getEndere�o());
		System.out.println("Forma de pagamento: " + c1.getFormaPagamento());
		
	}

}
