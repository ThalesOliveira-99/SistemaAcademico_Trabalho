package Configuração;

import Entidade.Aluno;

public class TesteSA {

	
		public static void main(String[] args) {
			
			//Criação do objeto Aluno
			Aluno a1 = new Aluno();
			
			//Atribuição dos valores
			a1.nome = "Thales";
			a1.matricula = "123456";
			
			System.out.println("Nome:" + a1.nome);
			System.out.println("Matricula: " + a1.matricula);
		}

}
