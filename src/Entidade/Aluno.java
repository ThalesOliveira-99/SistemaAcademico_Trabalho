package Entidade;

public class Aluno extends Pessoa {

	private String matricula;
	private String curso;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override // Pois o método está sobrescrevendo o método da Classe Pessoa(Classe Pai)
	public void apresentar() {
		System.out.println("Olá! Sou aluno: " + this.getNome());
		System.out.println("Minha matricula: " + this.getMatricula());
		System.out.println("Meu curso: " + this.getCurso());
	}

}
