package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {		

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "André Spiuca");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("André Spiuca Pereira", 34672);
		Aluno a2 = new Aluno("David Amom", 65987);
		Aluno a3 = new Aluno("Janes Joplin", 75654);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: " );
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
//		for(Aluno a : javaColecoes.getAlunos()) { // forma antiga
//			System.out.println(a);
//		}
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno " + a1 + " está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno amom = new Aluno("David Amom", 65987);
		System.out.println("E esse David, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(amom));
		
		System.out.println("O a2 é equals ao Amom?");
		System.out.println(a2.equals(amom));
		
		// obrigatoriamente o seguinte é true:
		
		System.out.println(a2.hashCode() == amom.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
