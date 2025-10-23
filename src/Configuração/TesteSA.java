package Configuração;

import Entidade.Aluno;
import Entidade.Professor;

public class TesteSA {

	
		public static void main(String[] args) {
			
			Aluno a1 = new Aluno();
			a1.setNome("Thales Oliveira ");
			a1.setMatricula("24082426-5");
			a1.setCurso("Programação Orientada a Objeto - POO");
			a1.apresentar(); // Executa o método da subclasse Aluno
			
			Professor p1 = new Professor();
			p1.setNome("Juan");
			p1.setDisciplina("Linguagem de Prog. - PHP");
			p1.apresentar(); // Executa o método da subclasse Professor
		}

}
