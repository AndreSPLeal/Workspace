package br.com.alura;

public class TestaBuscaAlunos {

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
		
		System.out.println("Quem é o aluno com a matricula 34672? ");
		Aluno aluno = javaColecoes.buscaMatriculado(34675);
		System.out.println("Aluno: " + aluno);

	}

}
