package Entidade;

public class Aluno {
	
	//atributos com a visibilidade privada. Iniciado o encapsulamento
	private String nome;
	private String matricula;
	
	//criação dos métodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
