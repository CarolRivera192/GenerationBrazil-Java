package br.com.exer7;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente pt = new Paciente();
		
		pt.setNome("Luke Tomlinson");
		pt.setIdade(29);
		pt.setLaudo("COVID");
		pt.setInternacao("O paciente ser� internado");
		pt.setLaudo("COVID");
		pt.setConvenio("SulAm�rica");
		pt.setMedico("Dra. Roberta Wood");
		
		System.out.println("Nome do paciente: " + pt.getNome());
		System.out.println("Idade do paciente: " + pt.getIdade());
		System.out.println("Laudo do paciente: " + pt.getLaudo());
		System.out.println("Interna��o: " + pt.getInternacao());
		System.out.println("Conv�nio do paciente: " + pt.getConvenio());
		System.out.println("M�dico do paciente: " + pt.getMedico());

	}

}
