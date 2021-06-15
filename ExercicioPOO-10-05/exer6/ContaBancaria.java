package br.com.exer6;

public class ContaBancaria {
	
	//Atributos
	private String banco;
	private String nome;
	private int conta;
	private int agencia;
	private int cpf;
    private double saque;
	private double saldo;
	
	//Métodos
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	void saque(double saque) {
		saque = saldo - saque;
	}

}
