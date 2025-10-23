package Entidade;

public class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void apresentar() {
		System.out.println("Apresentação !!!");
	}
}
