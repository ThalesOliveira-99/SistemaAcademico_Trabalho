package Configuração;

import Entidade.Aluno;
import Entidade.Professor;

public class TesteSA {

	
		public static void main(String[] args) {
			
			//Criação do objeto Aluno
			Aluno a1 = new Aluno();
			
			//Atribuição dos valores usando método set
			a1.setNome("Thales");
			a1.setMatricula("12345-6");
			a1.setCurso("POO");
			
			//Exibição dos valores usando método getter
			System.out.println("Nome:" + a1.getNome());
			System.out.println("Matricula: " + a1.getMatricula());
			System.out.println("Curso: "+ a1.getCurso());
			
			Professor p1 = new Professor();
			p1.setNome("Juan");
			p1.setDisciplina("Linguagem de Programção - PHP");
			System.out.println();
			System.out.println("Professor: " + p1.getNome());
			System.out.println("Disciplina: " + p1.getDisciplina());
		}

}
