package br.com.exer6;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cb = new ContaBancaria();
		
		cb.setBanco("Bradesco");
		cb.setNome("Rafaella");
		cb.setConta(2345);
		cb.setAgencia(00143);
		cb.setCpf(123456);
		cb.setSaldo(850.98);
		cb.saque(75.00);
		
		
		System.out.println("Banco: " + cb.getBanco());
		System.out.println("Nome do titular: " + cb.getNome());
		System.out.println("Conta do titular: " + cb.getConta());
		System.out.println("Agência do titular: " + cb.getAgencia());
		System.out.println("CPF do titular: " + cb.getCpf());
		System.out.println("Saldo: R$" + cb.getSaldo());
		System.out.println("Saque: R$" + cb.getSaque());

	}

}
