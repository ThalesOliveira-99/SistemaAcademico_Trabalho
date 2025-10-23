package Configuração;

import Entidade.Aluno;
import Entidade.Professor;

public class TesteSA {

	public static void main(String[] args) {

		// Optei declarar construtores com parâmetros para inicialização completa do
		// objeto somente em um linha
		Aluno a1 = new Aluno("Thales Oliveira", "24082426-5", "Programação Orientada a Objeto - POO");
		Professor p1 = new Professor("Juan", "Linguagem de Prog. - PHP");

		a1.apresentar(); // Executa o método da subclasse Aluno
		a1.avaliarDesempenho();
		p1.apresentar(); // Executa o método da subclasse Professor
	}

}
