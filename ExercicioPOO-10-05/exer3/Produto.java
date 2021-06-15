package br.com.exer3;

public class Produto {
	
	//Atributos
	private String codigo;
	private String modelo;
	private String descricao;
	private int valor;
	private int descontoDinheiro;
	
	//Métodos
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getDescontoDinheiro() {
		return descontoDinheiro;
	}
	public void setDescontoDinheiro(int descontoDinheiro) {
		this.descontoDinheiro = descontoDinheiro;
	}
	
	void descontoDinheiro(int descontoDinheiro) {
		descontoDinheiro = valor - descontoDinheiro;
	}
	
}
