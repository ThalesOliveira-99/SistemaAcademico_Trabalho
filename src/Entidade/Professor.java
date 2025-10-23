package Entidade;

public class Professor extends Pessoa{

	private String Disciplina;

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
	}
	
}
