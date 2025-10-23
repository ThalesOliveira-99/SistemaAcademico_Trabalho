package Entidade;

public class Professor extends Pessoa {

	private String Disciplina;

	// Construtor padrão. Será obrigado a inicializar o objeto passando os
	// argumentos.
	public Professor(String nome, String disciplina) {
		super(nome);
		Disciplina = disciplina;
	}

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}

	@Override // Pois o método está sobrescrevendo o método da Classe Pessoa(Classe Pai)
	public void apresentar() {
		System.out.println("Olá! Sou professor: " + this.getNome());
		System.out.println("Disciplina: " + this.getDisciplina());
		System.out.println();
	}

}
