package br.com.exer7;

public class Paciente {
	
	//Atributos
	private String nome;
	private int idade;
	private String laudo;
	private String internacao;
	private String convenio;
	private String medico;
	
	//Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getLaudo() {
		return laudo;
	}
	public void setLaudo(String laudo) {
		this.laudo = laudo;
	}
	public String getInternacao() {
		return internacao;
	}
	public void setInternacao(String internacao) {
		this.internacao = internacao;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}

}
