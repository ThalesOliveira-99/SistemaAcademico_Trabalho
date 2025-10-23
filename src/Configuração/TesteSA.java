package Configuração;

import Entidade.Aluno;

public class TesteSA {

	
		public static void main(String[] args) {
			
			//Criação do objeto Aluno
			Aluno a1 = new Aluno();
			
			//Atribuição dos valores usando método set
			a1.setNome("Thales");
			a1.setMatricula("12345-6");
			
			//Exibição dos valores usando método getter
			System.out.println("Nome:" + a1.getNome());
			System.out.println("Matricula: " + a1.getMatricula());
		}

}
