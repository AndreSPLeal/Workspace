package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "André Spiuca");
		
//		List<Aula> aulas = javaColecoes.getAulas(); // tudo em uma única linha
//		System.out.println(aulas);
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));//UnsupportedOperationException
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		//System.out.println(aulas);
		
		System.out.println(javaColecoes.getAulas());
		
		//System.out.println(aulas == javaColecoes.getAulas());

	}

}
